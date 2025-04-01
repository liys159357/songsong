package com.itheima;

import java.util.Scanner;

public class Arrydemo {
    public static void main(String[] args) {
        //目标：掌握动态初始化数组
        inputScore();
    }

    //设计一个方法录入学生成绩
    public static void inputScore() {
        double[] scores = new double[8];//动态初始化数组，只需确定数组的类型和存储数据的容量
        Scanner sc = new Scanner(System.in);
        double max = 0;
        double min = 100;
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            scores[i] = sc.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            } else if (scores[i] < min) {
                min = scores[i];
            }
            sum += scores[i];
        }
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("平均分是：" + sum / scores.length);

    }
}
