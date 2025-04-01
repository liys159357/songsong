package com.itheima.Variable;

public class Variable {
    public static void main(String[] args) {
        //目标：认识变量
        print();
    }
    //定义一个方法，来学习变量的定义
    public static void print(){
        //局部变量
        int a = 10;
        float b = 3.14f;
        long h=159785135464L;
        double c = 3.14;
        boolean flag=true;
        System.out.println(flag);
        System.out.println(a);
        System.out.println(h);
        System.out.println(b);
        System.out.println(c);
        System.out.println(b+c);
        System.out.println("**************************************");
        int d=10;
        d=20;
        System.out.println(d);
        d=d+1;
        System.out.println(d);
        System.out.println("*****************************************");
        //需求：微信钱包目前9.9，发出去5元，又收到6元，请实时输出钱包金额
        double money = 9.9;
        money = money - 5;
        System.out.println(money);
        money=money+6;
        System.out.println(money);
        //程序中可以直接写进制
        int e = 0b11111010;
        System.out.println(e);
        int f=0xfa;
        System.out.println(f);
        int g=0141;
        System.out.println(g);
        char p='a';
        System.out.println(p);
        String q="hello";
        System.out.println(q);
    }
}
