package com.itheima.arrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //目标：掌握ArrayList集合的基本使用。
        //创建ArrayList对象，代表一个集合容器
        ArrayList<String> list=new ArrayList<>(); //泛型定义集合。
        //添加数据
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("java2");
        System.out.println(list);//[hello, world, java, java2]
        //查看数据
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        //遍历集合查看数据
        for (int i = 0; i < list.size(); i++) {
            String a=list.get(i);
            System.out.println(a);
        }
        System.out.println("==================");
        //删除数据
        System.out.println(list.remove(2));//[hello, world, java2]  根据索引删除并返回删除的数据
        System.out.println(list);
        System.out.println(list.remove("world"));//根据元素删除，返回布尔值
        System.out.println(list);
        //修改数据
        list.set(2,"java3");
        list.set(0,"python");
        System.out.println(list);//[python, world, java3]
    }
}
