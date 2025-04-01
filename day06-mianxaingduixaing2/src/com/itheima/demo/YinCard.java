package com.itheima.demo;

public class YinCard extends Card{
    public YinCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    public YinCard() {
    }

    @Override
    public void pay(double money){
        System.out.println("您当前消费："+money);
        System.out.println("您实际消费"+money*0.9);
        if (getMoney()>money*0.9){
        setMoney(getMoney()-money*0.9);}else {
            System.out.println("您余额是："+getMoney()+"当前余额不足");
        }
    }
}
