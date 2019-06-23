package com.struct.list;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(2);
        a.add("124");
        a.add("55");
        a.add("666");
        a.add("88888888");
        a.add("88");
        a.add(1,"999999999");
        a.remove(4);
        a.remove("124");
        a.replace(0,"66666");
        a.addAfter("88","9876");
       System.out.println(a.size());
        System.out.println(a.indexOf("88"));
        System.out.println(a.contains("88"));
        System.out.println(a.size());
    }
}