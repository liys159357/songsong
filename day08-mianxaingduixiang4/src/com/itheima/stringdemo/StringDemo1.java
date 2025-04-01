package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建字符串对象，封装要处理的字符串数据，调用String提供的方法处理字符串.
        //1.方式一：直接用""就可以创建字符串对象，封装字符串数据
        String s1="hello,黑马";
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s1.length());//处理字符串的方法

        //2.方式二：通过构造器初始化对象。
        String s2=new String();
        System.out.println(s2);  //空字符串
        String s3=new String("abc");
        System.out.println(s3);

        char [] chars={'h','e','l','l'};
        String s4=new String(chars);
        System.out.println(s4);

        byte[] bytes={97,98,99,65,66,67};
        String s5=new String(bytes);
        System.out.println(s5);
        System.out.println("===================");
        //只有“”给出的字符串对象放在字符串常量池，相同内容只放一个。
        String s6="hello";
        String s7="hello";
        System.out.println(s6==s7);
        //每创建一次对象，都会在堆内存中创建一个对象，放在堆内存中。
        String s8=new String("hello");
        String s9=new String("hello");
        System.out.println(s8==s9);
        System.out.println("=====================================");
        //调用字符串的方法，处理字符串数据。
        //简易版的登录
        String username="admin";
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        //字符串对象的内容比较，千万不要用==，==默认是比较地址，字符串对象的内容一样时，地址不一定一样
        //判断字符串内容，建议大家用String提供的equals方法，只关心内容一样，就返回true，不关心地址。
        if (username.equals(name)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
        System.out.println("=======================================");
        //18663656520->186****6520
        System.out.println("请输入手机号：");
        String phone = sc.next();
        System.out.println(phone.replace(phone.substring(3,7),"****"));
    }
}

