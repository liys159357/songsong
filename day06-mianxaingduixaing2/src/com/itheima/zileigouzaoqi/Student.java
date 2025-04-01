package com.itheima.zileigouzaoqi;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age, char sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
        //this调用兄弟构造器。
        //super(...)、this(...)必须写在构造器的第一行，而且两者不能同时出现
        this(name, age,  sex,"黑马程序员");
    }

    public Student(String name, int age, char sex, String schoolName) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
