package com.itheima.branch;

public class fordemo2 {
    public static void main(String[] args) {
        //需求：定义1-10之间的奇数和，并把求和结果在控制台输出
        System.out.println("1-10之间奇数和为：" + sum(10));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                sum += i;
        }
        return sum;
    }
}
