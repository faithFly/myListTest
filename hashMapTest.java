package com.listTest;

import java.util.HashMap;

public class hashMapTest {
    public static void main(String [] args){
        //HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
        //
        //HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
        //
        //HashMap 是无序的，即不会记录插入的顺序。
        //
        //HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
        HashMap<Integer,String> site=new HashMap();
   //添加用put
        site.put(1,"faith");
        site.put(2,"acid");
        site.put(3,"tom");
        site.put(4,"jack");
        System.out.println(site);
//键是要具有唯一性的得是int 或者string
        HashMap<String,String> site2=new HashMap();
        //添加用put
        site2.put("11","faith");
        site2.put("22","acid");
        site2.put("33","tom");
        site2.put("44","jack");
        System.out.println(site2);
//我们可以使用 get(key) 方法来获取 key 对应的 value:
        System.out.println(site.get(1));
//我们可以使用 remove(key) 方法来删除 key 对应的键值对(key-value):
   site.remove(1);
        System.out.println(site);
        //删除全部也可以用clear()
        //迭代
        for (Integer i:site.keySet()
             ) {
            System.out.println("key:"+i+"value:"+site.get(i));
        }
        //API:https://www.runoob.com/manual/jdk11api/java.base/java/util/HashMap.html
    }
}
