package com.itheima.zileigouzaoqi;

public class Test2 {
    public static void main(String[] args) {
        //目标：this(...)调用兄弟构造器
        Student s1=new Student("小明",18,'男',"清华大学");
        System.out.println(s1);
        Student s2=new Student("小红",19,'女');
        System.out.println(s2);
    }
}

