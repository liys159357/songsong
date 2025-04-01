package com.itheima.fangfachongxie;

public class Test2 {
    public static void main(String[] args) {
        //方法重写的应用场景:子类从写Object的toString方法，以便返回对象的内容
        Student s = new Student("张三", 18, '男');
        System.out.println(s);
        //注意：直接输出对象，默认会调用Object的toString方法，返回对象的地址信息，要想返回信息，一般子类从写toString方法
        System.out.println(s.toString());
    }
}
class Student{
    private String name;
    private int age;
    private char sex;
    @Override
    public String toString(){
        return "姓名:"+name+"年龄:"+age+"性别:"+sex;
    }


    public Student() {

    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
