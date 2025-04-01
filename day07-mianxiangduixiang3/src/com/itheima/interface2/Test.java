package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        //目标：完成接口小案例。
        //1.定义学生类，创建学生对象，封装学生数据，才能交给别人处理学生的数据。
        //2.准备学生数据，自己造一些测试数据
        Student[] allStudents = new Student[10];
        allStudents[0] = new Student("张三", '男', 90);
        allStudents[1] = new Student("李四", '女', 80);
        allStudents[2] = new Student("王五", '男', 70);
        allStudents[3] = new Student("赵六", '女', 60);
        allStudents[4] = new Student("小明", '男', 90);
        allStudents[5] = new Student("小红", '女', 80);
        allStudents[6] = new Student("小刚", '男', 70);
        allStudents[7] = new Student("小绿", '女', 100);
        allStudents[8] = new Student("小花", '女', 60);
        allStudents[9] = new Student("小蓝", '女', 85);
        //3.提供两套业务实现方案，支持灵活切换（解耦合）：面向接口编程。
        //定义一个接口（规范思想）：必须完成打印全班学生信息，打印平均分。
        //定义第一套实现类，实现接口：实现打印学生信息，实现打印平均分。
        //定义第二套实现类：实现接口：实现打印学生信息（男女人数），实现打印平均分（去掉最高和最低分）。

        ClassDataInter cdi=new ClassDataInterImol1(allStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
     ClassDataInter cdi2=new ClassDataInterImol2(allStudents);
     cdi2.printAllStudentInfos();
     cdi2.printAverageScore();
    }
}
