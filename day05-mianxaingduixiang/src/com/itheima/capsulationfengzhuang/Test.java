package com.itheima.capsulationfengzhuang;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚封装的设计思想，合理隐藏合理暴露，学会如何隐藏如何暴露
        Student s1=new Student();
        s1.setAge(19);
        System.out.println(s1.getAge());
        s1.setChinese(100);
        s1.setMath(100);
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

    }
}
