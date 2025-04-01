package com.itheima.staticmethod;

public class Student {
    private double score;
    //静态方法：有static，属于类
    public static void printHelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    //实例方法：没有static修饰，属于对象持有
    public void printPass(){
        System.out.println(score>=60?"通过":"未通过");

    }
    public void setScore(double score) {
        if (score<=100&&score>=0){
        this.score = score;}else {
            System.out.println("成绩不合法");
        }
    }
}
