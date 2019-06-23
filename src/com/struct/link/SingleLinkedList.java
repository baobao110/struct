package com.struct.link;

//单向链表
public class SingleLinkedList<E> {

    private Node head = new Node();//头部节点

    private int size;//节点数目

    public int size() {
        return size;
    }

    public E get(int i) {
        Node p=head;
        for (int m=0;m<=i;m++){
            p=p.getNext();
        }
        return (E)p.getObject();
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object e) {
        return false;
    }


    public int indexOf(Object e) {
        return 0;
    }


    public void add(int i, E e) {
        Node p=head;
        for(int m=0;m<i;m++){
            p=p.getNext();
        }
        Node newNode=new Node(e);
        newNode.setNext(p.getNext());
        p.setNext(newNode);
        size++;
    }


    public void add(E e) {
        this.add(size,e);
    }

    public boolean addBefore(E obj, E e) {
        return false;
    }


    public boolean addAfter(E obj, E e) {
        return false;
    }
    //这里注意p的引用
    public boolean remove(int i) {
        if(i<0){
            return false;
        }
        if(i==size){
            return  false;
        }
        Node p=head;
        if(i==0){
            p.setNext(p.getNext().getNext());
        }
        else{
            for(int m=0;m<i;m++){
                p=p.getNext();
            }
            p.setNext(p.getNext().getNext());

        }
        size--;
        return true;
    }

    public boolean remove(E e) {
        Node p=head;
        Node<E> x=new Node<E>(e);
         for(int i=0;i<size;i++){
             p=p.getNext();
             if(p.getObject().equals(x.getObject())) {
                 remove(i);
                 return true;
             }
         }
         return false;
    }


    public Object replace(int i, E e) {
        return null;
    }

    @Override
    public String toString() {
       StringBuffer stringBuffer=new StringBuffer();
       stringBuffer.append("[");
       Node p=head;
       for(int i=0;i<size;i++){
           if(i!=size-1){
               stringBuffer.append(p.getNext().getObject()).append(",");
           }
           else{
               stringBuffer.append(p.getNext().getObject());
           }
           p=p.getNext();
       }
       stringBuffer.append("]");
       return  stringBuffer.toString();
    }
}
