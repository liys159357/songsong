package com.itheima.operator;

public class operator {
    public static void main(String[] args) {
        //目标：搞清楚基本的算数运算符
        print();
        print2(20);
    }
    public static void print()
    {
        int a = 10;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    //需求：演示一下几个扩展的赋值运算符
    public static void print2(int a)
    {

        a += 3;   //都自带强制类型转换  a=（a的类型）（a+3）
        System.out.println(a);
        a -= 3;
        System.out.println(a);
        a *= 3;
        System.out.println(a);
        a /= 3;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
    }
}
