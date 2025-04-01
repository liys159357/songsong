package com.itheima.type;

public class type {
    public static void main(String[] args) {
        //目标：认识自动类型转换,强制类型转换
        byte a=12;
        print(a);//自动类型转换
        print((long)a);//强制类型转换  数据类型 变量2=（数据类型） 变量1  数据太大装不下可能出现数据溢出
        System.out.println("*******************************************");
        double d=3.14;
        print3((short)d);
        double e=31.4;
        int l=(int)e;   //浮点型转换成整数，直接去掉小数部分
        print4(l);
    }
    public static void print(int b){
        System.out.println(b);
    }
    public static void print(long c){
        System.out.println(c);
    }
    public static void print3(short d){
        System.out.println(d);

    }
    public static void print4(int e){
        System.out.println(e);
    }
}
