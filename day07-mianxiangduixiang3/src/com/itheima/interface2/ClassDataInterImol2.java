package com.itheima.interface2;

public class ClassDataInterImol2 implements ClassDataInter{
    private Student[] Students;
    public ClassDataInterImol2(Student[] Students) {
        this.Students = Students;
    }
    @Override
    public void printAllStudentInfos() {
        int maleCount=0;
        int femaleCount=0;
        for (int i = 0; i <Students.length; i++) {
            Student s=Students[i];
            System.out.println(s.getName()+" "+s.getSex()+" "+s.getScore());
            if (s.getSex()=='男'){
                maleCount++;
            }else if (s.getSex()=='女'){
                femaleCount++;
            }
        }
        System.out.println("男生人数为："+maleCount);
        System.out.println("女生人数为："+femaleCount);
    }
    //实现打印平均分（去掉最高分、最低分）
    @Override
    public void printAverageScore() {
        Student s1=Students[0];
        double max=s1.getScore();
        double min=s1.getScore();
        double sum=s1.getScore();
        for (int i = 1; i < Students.length; i++) {
            Student s=Students[i];
            sum+=s.getScore();

            if (s.getScore()>max){
                max=s.getScore();
            }else if (s.getScore()<min){
                min=s.getScore();
            }
        }
        System.out.println("平均分为："+(sum-max-min)/(Students.length-2));

    }
}
