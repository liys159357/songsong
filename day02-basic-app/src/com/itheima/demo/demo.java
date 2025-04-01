package com.itheima.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //完成案例健康计算器
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身高:");
        double height = sc.nextDouble();
        System.out.println("请输入你的体重:");
        double weight = sc.nextDouble();
        System.out.println("请输入你的性别:");
        String sex = sc.next();
        System.out.println("请输入你的年龄:");
        int age = sc.nextInt();
        double bmi= BMI(height,weight);
        System.out.println("你的BMI值为："+bmi);
        System.out.println("你的BMR值为："+BMR(height,weight,age,sex));
    }
    public static double BMI(double height,double weight){
        return weight/(height*height);
    }
    //需求:计算BMR值
    public static double BMR(double height,double weight,int age,String sex){
        double bmr = 0;
        if(sex.equals("男")){
            bmr = 13.397 * weight + 4.799 * height - 5.677 * age + 88.362;
        }else{
            bmr = 9.247 * weight + 3.098 * height - 4.330 * age + 447.593;
        }
        return bmr;
    }
}
