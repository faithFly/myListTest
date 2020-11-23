package com.listTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayListTest {
  //ArrayList 类是一个可以动态修改的数组，
    // 与普通数组的区别就是它是没有固定大小的限制，
    // 我们可以添加或删除元素。
  //ArrayList 继承了 AbstractList ，并实现了 List 接口。
    public static void main(String [] args){
       //添加元素----add()
        ArrayList<String> sites=new ArrayList<>();
        sites.add("faith");
        sites.add("acid");
        sites.add("tom");
        sites.add("jack");
        System.out.println(sites);
        //访问元素----get()
        System.out.println(sites.get(2));//访问第二个元素
        //修改元素
        sites.set(2,"taylor");
        System.out.println(sites.get(2));//访问第二个元素
        //删除元素---remove
        sites.remove(2);
        System.out.println(sites);
        //计算大小 size
        System.out.println(sites.size());
        //迭代数组列表
        //1.for
//        for (int i=0;i<sites.size();i++){
//            System.out.println(sites.get(i));
//
//        }
        //2.foreach
        for (String i:sites
             ) {
            System.out.println(i);
        }
        //同样arraylist也可以存储其他数据类型
        ArrayList<Integer> myNum=new ArrayList<>();
        myNum.add(1);
        myNum.add(2);
        myNum.add(3);
        for (int j:myNum
             ) {
            System.out.println(j);
        }
        myNum.add(99);
        myNum.add(32);
        myNum.add(11);
        //arrayList排序
        Collections.sort(myNum);
        for (int i = 0; i < myNum.size(); i++) {
            System.out.println(myNum.get(i));
        }
//更多api方法：https://www.runoob.com/manual/jdk11api/java.base/java/util/ArrayList.html
    }

}
