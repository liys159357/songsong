package com.itheima.operator;

public class Operator3 {
    public static void main(String[] args) {
        //目标：掌握逻辑运算符的使用
        System.out.println(check(180,60,'男'));
        System.out.println(check2(180,50000));
        System.out.println(check2(160,60000));
        System.out.println(check3(180,60,'男'));
        System.out.println(check3(160,60,'男'));
        print();
    }
    //需求：判断某个人的条件是否满足择偶要求，如果满足返回true，否则是false
    public static boolean check(int height,int weight,char sex){
        boolean a = height>=170&&weight<=80&&sex=='女';
        return a;
    }
    public static boolean check2(int height,int income){
        boolean a=height>=180|income>=100000;
        return a;
    }
    //^异或，相同条件结果为false，条件不同为true
    public static boolean check3(int height,int weight,char sex){
        boolean a = height>=170^weight<=80^sex=='女';
        return a;
    }
    //判断&& ||与& |的区别
    public static void print(){
        int a=100;
        int b=200;
        System.out.println(a>b&&a++>1);
        System.out.println(a);
        System.out.println(a>b&a++>1);
        System.out.println(a);
        System.out.println(a<b||a++>1);
        System.out.println(a);
        System.out.println(a<b|a++>1);
        System.out.println(a);
    }
}
