package com.itheima.demo;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //猜数小游戏，猜大提示过大，猜小提示过小，直到猜中为止
        guess();
    }
    public static void guess() {
        Random random = new Random();  //得到一个随机数对象
        Scanner sc = new Scanner(System.in);
        int number = random.nextInt(100) + 1;  //生成1-100的随机数    等价于int num=(int)(Math.random()*100)+1;
        //Math.random()返回[0,1)的随机小数   Math.random()*100返回[0,100）的随机小数  Math.random()*100+1返回[1,101）的随机小数
        int guessNum;
        do {
            System.out.println("请输入你猜的数字(1-100之间)：");
            guessNum = sc.nextInt();
            if (guessNum > number) {
                System.out.println("猜大了，请重新输入：");
            } else System.out.println("猜小了，请重新输入：");
        } while (guessNum != number);
        System.out.println("恭喜你猜对了！");
    }
        }

