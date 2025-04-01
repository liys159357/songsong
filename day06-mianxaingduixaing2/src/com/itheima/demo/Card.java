package com.itheima.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok可以实现为类自动添加getter/setter方法 无参数构造器，toString方法
@Data//@Data注解可以添加getter/setter方法 无参数构造器，toString方法
@AllArgsConstructor   //有参构造器
@NoArgsConstructor    //无参构造器
public class Card {
    private String carId;
    private String name;
    private String phone;
    private double money;

    //预存金额
    public void deposit(double money){
        this.money=this.money+money;
    }
    //消费金额
    public void pay(double money){
        this.money=this.money-money;
    }
}
