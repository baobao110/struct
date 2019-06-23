package com.struct.tree;

public interface BinaryTree<T> {

    public boolean isEmpty();

    public int size();

    public int getHeight();

    public Node<T> findKey( Node<T> root,T value);

    public Node<T> findKey(T value);

    //前序遍历
    public void preOrderTraverse();

    //中序遍历
    public void inOrderTraverse();

    //后序遍历
    public void postOrderTraverse();

    public void preOrderBystack();

    public void inOrderBystack();

    public void postOrderBystack();

    public void levelOrderBystack();


}