package com.struct.list;

public interface List {

    //List数目
    public int size();

    //按照索引获取元素
    public Object get(int i);

    //判断List是否为空
    public boolean isEmpty();

    //判断元素是否存在
    public boolean contains(Object e);

    //查询元素的索引
    public int indexOf(Object e);

    //在某个索引插入元素
    public void add(int i, Object e);

    //在末尾添加元素
    public void add(Object e);

    //元素e插入到元素obj前面
    public boolean addBefore(Object obj, Object e);

    //元素e插入到元素obj后面
    public boolean addAfter(Object obj, Object e);

    //删除索引i
    public boolean remove(int i);

    //删除某个元素
    public boolean remove(Object e);

    //索引i的元素变为e
    public Object replace(int i, Object e);
}
