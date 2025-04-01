package com.itheima.branch;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double grade = sc.nextDouble();
        print(grade);
        System.out.println("请输入年龄：");
        int age=sc.nextInt();
        print2(age);
        System.out.println("请输入你的资产：");
        int money=sc.nextInt();
        print3(money);
    }
    public static void print(double grade) {
        if (grade>=90) {
            System.out.println("优秀");
        }else if (grade >= 80) {
            System.out.println("良好");
        }else if (grade >= 60) {
            System.out.println("及格");
        }else
            System.out.println("不及格");

    }
    public static void print2(int age) {
        if (age>=18){
            System.out.println("已成年");
            return;
        }
        System.out.println("未成年");
    }
    public static void print3(int money) {
        if (money >= 10000) {
            System.out.println("钱充足");
        } else {
            System.out.println("继续努力");
        }
    }
}


