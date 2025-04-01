package com.itheima.finaldemo;

public class Finaldemo {
    public static final String SCHOOL="黑马程序员";
    //final修饰静态变量，这个变量以后就是常量，常量一般用全大写字母表示
    private final String name="猪八戒";
    //final修饰实例变量(一般没有意义)
    public static void main(String[] args) {
        //目标：认识Final关键字作用
        //3.final修饰变量，变量有且仅能被赋值一次
        final int a=20;
//        a=30;//第二次赋值 报错
        final int [] arr={11,22,33,44};
        arr[0]=100;
        System.out.println(arr[0]);



    }
}
//1.final修饰类，类不能被继承
final class A{}
//class B extends A{}
//2.final修饰方法，方法不能被重写
class C{
    public final void show(){
        System.out.println("show方法被调用");
    }
}
//class D extends C{
//    @Override
//    public void show(){
//        System.out.println("show方法被调用");
//    }
//}

