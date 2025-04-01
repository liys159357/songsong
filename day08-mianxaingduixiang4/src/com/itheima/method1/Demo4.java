package com.itheima.method1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
        //目标：理解构造器引用
        //创建了接口的匿名内部类对象
        CarFactory cf=new CarFactory() {
            @Override
            public Car getCar(String name) {
                return new Car(name);
            }
        };
        CarFactory cf2=Car::new;
        Car c2=cf2.getCar("宝马");
        System.out.println(c2.getName());
        Car c1=cf.getCar("奔驰");
        System.out.println(c1.getName());
    }
}
@FunctionalInterface
interface CarFactory{
    Car getCar(String name);
}
@Data
@AllArgsConstructor
@NoArgsConstructor
class Car{
    private String name;
}
