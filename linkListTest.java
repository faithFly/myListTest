package com.listTest;

import java.util.LinkedList;

public class linkListTest {
    public static void main(String [] args){
//链表（Linked list）是一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的地址。
//
//链表可分为单向链表和双向链表。
//
//一个单向链表包含两个值: 当前节点的值和一个指向下一个节点的链接。
//一个双向链表有三个整数值: 数值、向后的节点链接、向前的节点链接。
//  Java LinkedList（链表） 类似于 ArrayList，是一种常用的数据容器。

//与 ArrayList 相比，LinkedList 的增加和删除对操作效率更高，而查找和修改的操作效率较低
//        以下情况使用 ArrayList :
//
//        频繁访问列表中的某一个元素。
//        只需要在列表末尾进行添加和删除元素操作。
//        以下情况使用 LinkedList :
//
//        你需要通过循环迭代来访问列表中的某些元素。
//        需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
  //创建一个简单的linkList实例
        LinkedList<String> sites=new LinkedList<>();
        sites.add("faith");
        sites.add("acid");
        sites.add("tom");
        sites.add("jack");
        System.out.println(sites);
        //首部添加元素
        sites.addFirst("taylor");
        System.out.println(sites);
       //尾部添加元素
        sites.addLast("rookie");
        System.out.println(sites);
        //首部移除元素
        sites.removeFirst();
        System.out.println(sites);
        //尾部移除元素
        sites.removeLast();
        System.out.println(sites);
        //获取首部和尾部的元素
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
//迭代元素
        for (String i:sites
             ) {
            System.out.println(i);
        }
        //更多方法https://www.runoob.com/manual/jdk11api/java.base/java/util/LinkedList.html
    }
}
