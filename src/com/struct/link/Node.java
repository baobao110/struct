package com.struct.link;

public class Node<E> {

    private E object;

    private Node next;

    public Node(){
        super();
    }

    public Node(E object){
        this.object=object;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
