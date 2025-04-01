package com.itheima.danlishejimoshi;
//懒汉式单例
public class B {
    //1.把类的构造器私有
    private B(){

    }
    //2.定义一个静态变量用于存储对象
    private static B b;
    //3.提供一个静态方法，保证返回的是同一个对象
    public static B getB(){
        if (b==null){
            //第一次拿对象时，会创建对象，给静态变量b记住
            b = new B();
        }return b;
    }
}
