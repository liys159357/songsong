package com.itheima.operator;

public class operator2 {
    public static void main(String[] args) {
        //目标：三元运算符
        print(10,20);
        print2(50);
        int result=print3(100,200,300,400);
        System.out.println(result);
    }
    public static void print(int a,int b){
        int max = a>b?a:b;
        System.out.println(max);
    }
    //需求:判断成绩是否通过或挂科
    public static void print2(int score){
        String result = score>=60?"通过":"挂科";
        System.out.println(result);
    }
    //需求:求四个整数的较大值返回
    public static int print3(int a,int b,int c,int d){
        int max = a>b?a:b;
        max = max>c?max:c;
        max = max>d?max:d;
        return max;
    }
}
