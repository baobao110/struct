package com.struct.link;

public class Nodes<E>{

    private Nodes before;

    private Nodes next;

    private E object;

    public Nodes getBefore() {
        return before;
    }

    public void setBefore(Nodes before) {
        this.before = before;
    }

    public Nodes getNext() {
        return next;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }

    public E getObject() {
        return object;
    }

    public void setObject(E object) {
        this.object = object;
    }

    public Nodes(E object) {
        this.object = object;
    }

    public Nodes() {
    }
}
