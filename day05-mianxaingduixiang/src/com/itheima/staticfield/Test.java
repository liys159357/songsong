package com.itheima.staticfield;

public class Test {
    public static void main(String[] args) {
        //目标：认识static修饰成员变量、特点、访问机制、搞清楚作用
        //访问静态变量：类名.静态变量名（推荐）
        Student.name="小明";
        System.out.println(Student.name);

        //对象名.静态变量名
        Student s1=new Student();
        s1.name="小红";
        System.out.println(s1.name);
        Student s2=new Student();
        s2.name="小芳";
        System.out.println(s1.name);
        System.out.println(Student.name);

        //2.实例变量访问：对象名.实例变量名
        s1.age=18;
        s2.age=23;
        System.out.println(s1.age);
    }
}
