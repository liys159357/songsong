package com.itheima.demo;

public class Test4 {
    public static void main(String[] args) {
        //需求：判断101-200之间有多少个素数，并输出所有素数
        int count = 0;
        for (int i = 101; i <201 ; i++) {
            boolean b = isPrime(i);
            if (b){
            count+=1;
            System.out.println(i);}
        }
        System.out.println("101-200之间素数有:"+count+"个");
    }
    public static boolean isPrime(int num){
        for (int i = 2; i <num/2 ; i++) {                 //从2开始到该数的一半，如果能被整除，则不是素数
            if (num%i==0)
                return false;
        }return true;
    }
}
