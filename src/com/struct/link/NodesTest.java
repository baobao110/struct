package com.struct.link;

public class NodesTest {

    public static void main(String[] args) {
        LinkedList<String> linkedList =new LinkedList<String>();
        linkedList.add("122");
        linkedList.add("222");
        ///linkedList.add(1,"kkkkk");
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(1));
        //System.out.println(linkedList.remove("kkkkk"));
        //System.out.println(linkedList.remove("222"));
        System.out.println(linkedList.toString());
        System.out.println(linkedList.addBefore("222","77777"));
        System.out.println(linkedList.toString());
        System.out.println(linkedList.addAfter("77777","9999"));
        System.out.println(linkedList.toString());
    }
}
