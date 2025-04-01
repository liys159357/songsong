package com.itheima.danlishejimoshi;
//设计单例设计模式，单例类(饿汉式单例)
public class A {
    //1.私有构造器:确保单例类对外不能创建太多对象，单例才有可能性
    private A(){

    }
    //2.定义一个类变量(静态变量)记住类的一个对象
    private static A a=new A();
    //3.定义一个类方法返回对象
    public static A getA(){
        return a;
    }
}
