package com.itheima.interface2;

public class ClassDataInterImol1 implements ClassDataInter{
    private Student[] Students;  //记住送来的全班学生对象的信息
    public ClassDataInterImol1(Student[] Students){
        this.Students = Students;
    }
        @Override
        public void printAllStudentInfos(){
            System.out.println("打印所有学生信息");
            for (int i = 0; i < Students.length; i++) {
                Student s=Students[i];
                System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
            }
        }
        @Override
        public void printAverageScore(){
            System.out.println("打印所有学生平均分");
            double sum = 0;
            for (int i = 0; i < Students.length; i++) {
                sum=sum+Students[i].getScore();
            }
            System.out.println("平均分为："+(sum/Students.length));
        }
    }

