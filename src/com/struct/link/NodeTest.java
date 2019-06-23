package com.struct.link;

public class NodeTest {
    public static void main(String[] args) {
        SingleLinkedList<String>singleLinkedList = new SingleLinkedList<String>();
        singleLinkedList.add("122");
        singleLinkedList.add("121212");
        singleLinkedList.remove(0);
        singleLinkedList.add(0,"222222");
        System.out.println(singleLinkedList.size());
        System.out.println(singleLinkedList.remove("121212"));
        System.out.println(singleLinkedList.toString());
    }
}
