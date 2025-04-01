package com.itheima.branch;

import java.util.Scanner;

public class fordemo {
    public static void main(String[] args) {
        //目标：求奇数和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要算多少的累加和");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
