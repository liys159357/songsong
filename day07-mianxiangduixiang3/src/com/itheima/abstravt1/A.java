package com.itheima.abstravt1;
//抽象类
public abstract class A {
    private String name;
    private int age;
    public A(){
        System.out.println("无参构造");
    }

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //抽象方法:必须用abstract修饰，只有方法的声明，没有方法体
    public abstract void show();
}


