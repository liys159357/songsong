package com.itheima.fangfachongxie;

public class Test {
    public static void main(String[] args) {
        //目标：认识方法重写，再清楚场景
        Dog dog = new Dog();
        dog.cry();
    }
}
class Animal{
    public void cry(){
        System.out.println("动物会叫");
    }
}
class Dog extends Animal{
    //方法重写：方法名称、形参列表必须一样，这个方法就是方法重写
    @Override //方法重写的效验注解（标志）：要求方法名称和形参列表必须与重写方法一致，否则报错
    public void cry(){
        System.out.println("汪汪汪");
    }
}
