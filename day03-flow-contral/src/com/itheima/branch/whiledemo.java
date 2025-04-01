package com.itheima.branch;

public class whiledemo {
    public static void main(String[] args) {
        //假设你在银行投资了100000元，银行复利是1.7%，问多少年后能实现本金翻倍
        System.out.println("需要"+sum(100000)+"后能实现本金翻倍");
    }
    public static int sum(int n)
    {
        double target=2*n;
        int year=0;
        double money=n;
        while (money<=target){
            money=money+money*0.017;
            year=year+1;
        }
        return year;
    }
}
