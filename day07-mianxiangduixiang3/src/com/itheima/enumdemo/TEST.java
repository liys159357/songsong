package com.itheima.enumdemo;

public class TEST {
    public static void main(String[] args) {
        //目标：认识枚举类，搞清楚其本质特点。
        A a1=A.X;
        System.out.println(a1);
        A a2=A.Y;
        System.out.println(a2.toString());
        System.out.println(a2.ordinal()); //Y的索引为1
    }
}
