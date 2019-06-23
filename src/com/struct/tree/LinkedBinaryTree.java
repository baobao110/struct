package com.struct.tree;

import java.util.LinkedList;
import java.util.Queue;

//二叉树遍历递归的思想
public class LinkedBinaryTree<T>implements  BinaryTree<T> {

    private Node<T> root;//根结点


    public LinkedBinaryTree(Node<T> root) {
        this.root = root;
    }

    public LinkedBinaryTree() {
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public int size() {
        return size(root);
    }

    private int size(Node<T> node){
        if(null!=node){
            //递归返回左子树的结点
            int left=size(node.getLeftChild());
            //递归返回右子树的结点
            int right=size(node.getRightChild());
            //返回左右子树以及根和
            return left+right+1;
        }
        return 0;
    }

    @Override
    public int getHeight() {
        return getHeight(root);
    }
    private  int getHeight(Node<T> node){
        if(null!=node){
            //递归返回左子树的高度
            int left=getHeight(node.getLeftChild());
            //递归返回右子树的高度
            int right=getHeight(node.getRightChild());
            //返回高度较大的+1
            return left>right?left+1:right+1;
        }
        return 0;
    }

    @Override
    public Node<T> findKey(T value) {
        return this.findKey(root,value);
    }

    public Node<T> findKey(Node<T> root, T value) {
        if(null==root){
            return null;
        }
        else{
            System.out.println("value="+value);
            if(null!=root&&root.getValue().equals(value)){
                return root;
            }
            else{
                Node left=findKey(root.getLeftChild(),value);
                Node right=findKey(root.getRightChild(),value);
                if(null!=left&&left.getValue().equals(value)){
                    return left;
                }
                else {
                    if (null!=right&&right.getValue().equals(value)){
                        return right;
                    }
                    else{
                        return null;
                    }
                }
            }
        }
    }


    @Override
    public void preOrderTraverse() {
        this.preOrderTraverse(root);
    }

    private void preOrderTraverse(Node<T>node) {
        if (null != node) {
            System.out.println(node.getValue());
            //对左子树先遍历 同样进行先序遍历
            this.preOrderTraverse(node.getLeftChild());
            //对右子树遍历 同样进行先序遍历
            this.preOrderTraverse(node.getRightChild());
        }
    }


    @Override
    public void inOrderTraverse() {
        this.inOrderTraverse(root);
    }

    private void inOrderTraverse(Node<T> node) {
        if (null != node) {
            this.inOrderTraverse(node.getLeftChild());
            System.out.println(node.getValue());
            this.inOrderTraverse(node.getRightChild());
        }

    }

    @Override
    public void postOrderTraverse() {
        this.postOrderTraverse(root);
    }

    private void postOrderTraverse(Node<T> node){
        if(null!=node) {
            this.postOrderTraverse(node.getLeftChild());
            this.postOrderTraverse(node.getRightChild());
            System.out.println(node.getValue());
        }
    }

    @Override
    public void preOrderBystack() {

    }

    @Override
    public void inOrderBystack() {

    }

    @Override
    public void postOrderBystack() {

    }

    @Override
    public void levelOrderBystack() {
        if(null==root){
            return;
        }
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(root);
        while (queue.size()!=0){
            int len=queue.size();
            for(int i=0;i<len;i++){
               Node temp=queue.poll();
                System.out.print(temp.getValue()+" ");
                if(temp.getLeftChild()!=null){
                    queue.add(temp.getLeftChild());
                }
                if(temp.getRightChild()!=null){
                    queue.add(temp.getRightChild());
                }
            }
        }

    }
}
