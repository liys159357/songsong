package com.itheima.Scanner;
//1.导包：告诉我们自己的程序，去JDK哪里找Scanner程序用
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        printUserInfo();
        int a=10;
        int b=20;
        System.out.println();

    }
    //需求：我是一个零基础小白，请帮我写一个程序，可以让用户键盘输入用户名和年龄，然后打印出来
    public static void printUserInfo() {

        //2.创建一个对象，用于接收键盘数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请+输入用户名：");
        //3.接收键盘输入的数据，调用next()方法，接收一个字符串
        String username = sc.next();  //让程序在这一行暂停，等到用户输入一个字符串名称，直接按了回车键之后，把名字交给变量username记住再往下走
        System.out.println("您叫"+username);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();//让程序在这一行暂停，等到用户输入一个整数，直接按了回车键之后，把年龄交给变量age记住再往下走
        System.out.println("您今年"+age+"岁");
    }
}
