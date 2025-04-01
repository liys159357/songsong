package com.itheima.object;
//学生类
//封装：把数据和数据的处理放到同一个类中去
public class Student {
    String name;
    double chinese;
    double math;

    public void printAllScore(){
        System.out.println(name+"的总成绩为："+(chinese+math));
    }
    public void printAvgScore(){
        System.out.println(name+"的平均成绩为："+(chinese+math)/2);
    }
}
