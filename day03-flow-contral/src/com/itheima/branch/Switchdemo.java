package com.itheima.branch;

import java.util.Scanner;

public class Switchdemo {
    public static void main(String[] args) {
        //switch分支结构的应用和写法
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入性别：");
//        String sex = sc.next();
        print();
    }
    //需求：根据男女性别的不同，推荐不同的书本信息给其观看
    public static void print()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex = sc.next();
        switch (sex){
            case "男":
                System.out.println("男的，推荐《Java从入门到精通》");
                break;
            case "女":
                System.out.println("女的，推荐《Python从入门到精通》");
                break;
            default:
                System.out.println("性别输入有误，请重新输入");
        }
    }
}
