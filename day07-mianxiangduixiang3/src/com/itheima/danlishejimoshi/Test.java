package com.itheima.danlishejimoshi;

public class Test {
    public static void main(String[] args) {
        //目标：设计单例类。
        A a1=A.getA();
        A A2=A.getA();
        System.out.println(a1);
        System.out.println(A2);
        System.out.println("============================================");

        B b1=B.getB();
        B b2=B.getB();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
    }
}
