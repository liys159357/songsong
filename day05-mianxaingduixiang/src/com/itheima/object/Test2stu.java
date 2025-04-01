package com.itheima.object;

public class Test2stu {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="波妞";
        s1.chinese=100;
        s1.math=100;
        s1.printAllScore();
        s1.printAvgScore();
        Student s2 = new Student();
        s2.name="潘仔";
        s2.chinese=59;
        s2.math=100;
        s2.printAvgScore();
        s2.printAllScore();
    }
}
