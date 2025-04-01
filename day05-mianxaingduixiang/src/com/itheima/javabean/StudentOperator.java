package com.itheima.javabean;

public class StudentOperator {
    //提供方法：打印学生对象的总成绩
    //必须拿到处理的学生对象
    private com.itheima.javabean.Student s; //用于记住将来要操作的学生对象
    public  StudentOperator(Student s1){
        this.s=s1;
    }
    public void printAllScore()
    {
        System.out.println("总成绩为："+(s.getChinese()+s.getMath()));
    }

    //提供方法：打印学生的平均成绩
    public void printAvgScore()
    {
        System.out.println("平均成绩为："+(s.getChinese()+s.getMath())/2);
    }
}
