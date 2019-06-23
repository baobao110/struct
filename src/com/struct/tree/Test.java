package com.struct.tree;

public class Test {

    public static void main(String[] args) {
        Node<Integer> node5=new Node<Integer>(5,null,null);
        Node<Integer> node4=new Node<Integer>(4,null,node5);
        Node<Integer> node7=new Node<Integer>(7,null,null);
        Node<Integer> node6=new Node<Integer>(6,null,node7);
        Node<Integer> node3=new Node<Integer>(3,null,null);
        Node<Integer> node2=new Node<Integer>(2,node3,node6);
        Node<Integer> node1=new Node<Integer>(1,node4,node2);
        BinaryTree<Integer> binaryTree = new LinkedBinaryTree<Integer>(node1);
        System.out.println(binaryTree.isEmpty());
        System.out.println("先序遍历");
        binaryTree.preOrderTraverse();
        System.out.println("中序遍历");
        binaryTree.inOrderTraverse();
        System.out.println("后序遍历");
        binaryTree.postOrderTraverse();
        System.out.println("二叉树的高度:"+binaryTree.getHeight());
        System.out.println("结点总数:"+binaryTree.size());
        System.out.println("find");
        System.out.println(binaryTree.findKey(node1,1));
        System.out.println(binaryTree.findKey(1));
        binaryTree.levelOrderBystack();
    }
}
