package com.itheima.demo;

public class GoldCard extends Card{
    public GoldCard() {
    }

    public GoldCard(String carId, String name, String phone, double money) {
        super(carId, name, phone, money);
    }

    @Override
    public void pay(double money){
        System.out.println("您当前消费："+money);
        System.out.println("您实际支付："+(money*0.8));
        if (getMoney()>money*0.8){
        //更新金卡账户余额。
        setMoney(getMoney()-money*0.8);
        System.out.println("您当前余额为："+getMoney());}else {
            System.out.println("您余额为："+getMoney()+"当前余额不足");
        }
        //判断消费如果大于200，调用一个独有的功能，打印洗车票
        if (money*0.8>=200){
            printTicket();
        }else {
            System.out.println("您当前消费不满200元，不能免费洗车");
        }
    }
    //打印洗车票
    public void printTicket(){
        System.out.println("您本次消费了"+"请携带本卡到店洗车");
    }
}
