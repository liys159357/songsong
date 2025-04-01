package com.itheima.method;

public class Method {
    public static void main(String[] args) {
        int s=sum(10,20);
        System.out.println("和是："+s);
        System.out.println("*******************************************");
        int s2=sum(100,200);
        System.out.println("和是："+s2);
        print();
        System.out.println("验证码是："+getCode(6));
        System.out.println("验证码是："+getCode(4));
    }
    //定义一个方法，求任意两个整数的和返回值
    public static int sum(int a,int b){
        return a+b;
    }
    public static void print(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }
    //需求：获取一个指定位数的验证码返回
    public static String getCode(int n){
        String code="";
        for (int i = 0; i < n; i++) {
            int num=(int)(Math.random()*10);
            code+=num;
        }
        return code;
    }
}
