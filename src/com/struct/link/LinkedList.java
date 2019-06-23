package com.struct.link;

//双向链表
public class LinkedList<E> {

    private int size;

    private Nodes<E> head =new Nodes<E>();

    public LinkedList() {
        this.size =0;
    }

    public int size() {
        return size;
    }


    public E get(int i) {
        if(i<0||i>=size){
            throw new RuntimeException("数组越界");
        }
        else{
            Nodes p=head;
            for(int m=0;m<=i;m++){
                p=p.getNext();
            }
            return (E)p.getObject();
        }
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean contains(Object e) {
        return false;
    }


    public int indexOf(E e) {
        return 0;
    }


    public void add(int i, E e) {
          Nodes p=head;
          for(int m=0;m<i;m++){
              p=p.getNext();
          }
          Nodes nodes=new Nodes(e);
          nodes.setNext(p.getNext());
          ;p.setNext(nodes);
          size++;
    }


    public void add(E e) {
        add(size,e);
    }

    public boolean addBefore(E obj, E e) {
        Nodes<E>p=head;
        for(int i=0;i<size;i++){
            if(p.getNext().getObject().equals(obj)){
                Nodes<E> news = new Nodes<E>();
                news.setObject(e);
                //这里注意先后顺序
                news.setBefore(p);
                news.setNext(p.getNext());
                p.getNext().setBefore(news);
                p.setNext(news);
                size++;
                return true;
            }
            else{
                p=p.getNext();
            }
        }
        return false;
    }

    public boolean addAfter(E obj, E e) {
        Nodes<E> p =head;
        for (int i=0;i<size;i++){
            if(p.getNext().getObject().equals(obj)){
                p=p.getNext();
                Nodes<E> news = new Nodes<E>();
               news.setObject(e);
               news.setBefore(p);
               news.setNext(p.getNext());
               p.getNext().setBefore(news);
               p.setNext(news);
                size++;
                return  true;
            }
            else{
                p=p.getNext();
            }
        }
        return false;
    }

    public boolean remove(int i) {
        return false;
    }


    public boolean remove(E e) {
        Nodes <E>p=head;
        for(int i=0;i<size;i++){
            if(p.getNext().getObject().equals(e)) {
                    p.setNext(p.getNext().getNext());
                    size--;
                    return true;
            }
            else{
                p=p.getNext();
            }
        }
        return false;
    }

    public E replace(int i, E e) {
        return null;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("[");
        Nodes<E>p=head;
        for(int i=0;i<size;i++){
            if(i!=size-1){
                stringBuffer.append(p.getNext().getObject()).append(",");
                p=p.getNext();
            }
            else {
                stringBuffer.append(p.getNext().getObject());
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
