package com.listTest;

import java.util.HashSet;

public class hashSetTest {
    public static void main(String [] args){
        //HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
        //
        //HashSet 允许有 null 值。
        //
        //HashSet 是无序的，即不会记录插入的顺序。
        //
        //HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
        //
        //HashSet 实现了 Set 接口。
        HashSet<String> sites=new HashSet<>();
        sites.add("faith");
        sites.add("acid");
        sites.add("tom");
        sites.add("jack");
        sites.add("jack");
        System.out.println(sites);
//[acid, tom, faith, jack]
        //添加了两个jack也只会出现一次
        //判断元素是否存在
        System.out.println(sites.contains("faith"));
        System.out.println(sites.contains("xu"));
    //我们可以使用 remove() 方法来删除集合中的元素
        sites.remove("faith");
        System.out.println(sites);
        //删除所有  clear()
//        sites.clear();
//        System.out.println(sites);
    //迭代
        for (String i:sites
             ) {
            System.out.println(i);
        }
        //API:https://www.runoob.com/manual/jdk11api/java.base/java/util/HashSet.html
    }
}
