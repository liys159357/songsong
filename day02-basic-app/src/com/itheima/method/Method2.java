package com.itheima.method;

public class Method2 {
    public static void main(String[] args) {
        print(100);
        print("hello");
        print(1000, "world");
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int a, String str) {
        System.out.println(a);
        System.out.println(str);
    }
}

