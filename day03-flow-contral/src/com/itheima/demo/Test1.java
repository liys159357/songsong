package com.itheima.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //目标：简易版计算器开发
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = sc.nextDouble();
        System.out.println("请输入运算符（+、-、*、/）：");
        String op = sc.next();
        System.out.println("请输入第二个数字：");
        double num2 = sc.nextDouble();
        System.out.println("计算结果为"+getResult(num1,op,num2));
    }
    public static double getResult(double num1,String op,double num2){
        double result = 0;
        switch(op){
            case "+":
            result = num1 + num2;
            break;
            case "-":
            result = num1 - num2;
            break;
            case "*":
            result = num1 * num2;
            break;
            case "/":
            result = num1 / num2;
            break;
            default:
            System.out.println("运算符输入错误");
        }
        return result;
    }
}
