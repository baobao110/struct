package com.struct.list;

/**
 * 顺序表底层是数组
 * 长度动态变化
 * 这里注意泛型的使用
 */
public class ArrayList<E> {

    private E[] list;

    private int size=0;

    public ArrayList(int size) {
        this.list=(E[]) new Object[size];
 }

    public ArrayList() {
          this.size=0;
          this.list=(E[]) new Object[16];
    }

    public int size() {
        return size;
    }


    public Object get(int i) {
        if(i<0|| i>=size){
            throw  new RuntimeException("数组越界");
        }
        return list[i];
    }


    public boolean isEmpty() {
        return size==0;
    }


    public boolean contains(E e) {
        boolean flag=false;
        for(int i=0;i<size;i++){
            if(list[i].equals(e)){
                flag=true;
                break;
            }
        }
        return flag;
    }


    public int indexOf(E e) {
        int m=-1;
        for(int i=0;i<size;i++){
            if(list[i].equals(e)){
                m=i;
                break;
            }
        }
       return m;
    }

    public void add(int i, E e) {
           if(size>list.length*0.75){
               E[] obj=(E[])new Object[list.length*2];
               for(int m=0;m<i;m++){
                   obj[m] =list[m] ;
               }
               obj[i]=e;
               for(int m=i;m<size;m++){
                   obj[m+1]=list[m];
               }
               this.list=obj;
                this.size++;
           }
           else{
               E[]obj=(E[]) new Object[list.length];
               for(int m=0;m<i;m++){
                      obj[m]=list[m];
               }
               obj[i]=e;
               for(int m=i;m<size;m++){
                   obj[m+1]=list[m];
               }
                this.list=obj;
                this.size++;
          }
    }

    public void add(E e) {
          if(size>list.length*0.75){
               E[] obj=(E[]) new Object[list.length*2];
               for(int i=0;i<size;i++){
                   obj[i]=list[i];
               }
               obj[size]=e;
               this.list=obj;
               this.size++;
          }
           else {
               this.list[size]=e;
               this.size++;
          }
    }

    public boolean addBefore(E obj, E e) {
        int m=-1;
        for(int i=0;i<size;i++){
            if(list[i].equals(obj)){
                m=i;
                break;
            }
        }
        if(m==-1){
            throw  new RuntimeException("元素不存在");
        }
        else{
            add(m,e);
            return true;
        }
    }

    public boolean addAfter(E obj, E e) {
        int m=-1;
        for(int i=0;i<size;i++){
            if(list[i].equals(obj)){
                m=i;
                break;
            }
        }
        if(m==-1){
            throw new RuntimeException("元素不存在");
        }
        else{
            add(m+1,e);
            return true;
        }
    }

    public boolean remove(int i) {
        if(i<0||i>size){
            throw new RuntimeException("数组越界");
        }
        else{
            for(int m=i+1;m<size;m++){
                list[m-1]=list[m];
            }
            list[size-1]=null;
            size--;
            return true;
        }
    }

    public boolean remove(E e) {
        int m = -1;
        for (int i = 0; i < size; i++) {
            if (list[i].equals(e)) {
                m = i;
                break;
            }
        }
        if (m == -1) {
            throw new RuntimeException("元素不存在");
        }
        for (int i = m; i < size-1;i++){
            list[i]=list[i+1];
        }
        list[size-1]=null;
        size--;
        return true;
    }

    public E replace(int i, E e) {
        if(i<0||i>=size){
            throw new RuntimeException("数组越界");
        }
        else{
            list[i]=e;
            return  list[i];
        }
    }
}
