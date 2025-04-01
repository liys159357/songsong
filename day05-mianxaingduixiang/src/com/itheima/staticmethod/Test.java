package com.itheima.staticmethod;

public class Test {
    public static void main(String[] args) {
        //目标：认识static修饰和不修饰方法的区别
        //1.类名.静态方法名
        Student.printHelloworld();
        //3.对象名.实例方法

        Student s1=new Student();
        s1.setScore(80);
        Student s2=new Student();
        s2.setScore(40);
        s1.printPass();
        s2.printPass();
        //规范：如果这个功能只是为了做一个功能且不需要直接访问对象的数据，这个方法直接定义成静态方法
    }

    public  void print(){
        Student.printHelloworld();
    }

}
