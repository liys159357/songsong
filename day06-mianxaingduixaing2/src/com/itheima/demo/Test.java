package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：加油站支付小程序
        //1.创建卡片类，以便创建金卡或银卡对象，封装车主数据。
        //2.定义一个卡片父类：Card,定义金卡和银卡的共同属性
        //3.定义一个金卡类，继承Card类。必须重写消费方法(8折优惠)，独有功能打印洗车票
        //4.办一张金卡：创建金卡对象，交给一个独立的业务（支付机）来完成：存款、消费
        GoldCard goldCard = new GoldCard("123465","张三","13888888888",10000);
        goldCard.deposit(100);
        YinCard yinCard = new YinCard("987654","李四","1399999998",6000);
        pay2(goldCard);
        pay2(yinCard);

    }
    //支付机：有一个方法来表示,可能接收金卡，也可能接银卡
    public static void pay2(Card c){
        System.out.println("请刷卡,请您输入当前消费金额:");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.pay(money);
    }
}
