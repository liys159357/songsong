package com.itheima.capsulationfengzhuang;

public class Student {
    String name;
    //1.如何隐藏：使用private关键字修饰成员变量，就只能在本类中直接访问，其他任何位置不能直接访问。访问就是打点
    private int age;
    private double chinese;
    private double math;

    //2.如何合理暴露，使用public修饰的get和set方法合理暴露
    //成员变量的取值和赋值
    public void setAge(int age){
        if (age>0&&age<120) {
            this.age = age;
        }else {
            System.out.println("年龄不合法");
        }
     }
     //语文成绩成套的get set方法
     public void setChinese(double chinese){
        this.chinese=chinese;
    }
    public double getChinese(){
        return chinese;
    }
    //数学成绩成套的get set方法
    public void setMath(double math){
        this.math=math;
    }
     public double getMath(){
        return math;
    }


    public int getAge(){
        return age;
    }

    public void printAllScore(){
        System.out.println(name+"的总成绩为："+(chinese+math));
    }
    public void printAvgScore(){
        System.out.println(name+"的平均成绩为："+(chinese+math)/2);
    }
}

