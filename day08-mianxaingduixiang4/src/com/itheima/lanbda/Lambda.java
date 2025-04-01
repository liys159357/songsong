package com.itheima.lanbda;

public class Lambda {
    public static void main(String[] args) {
        //目标：认识Lambda表达式：搞清楚其基本作用（替代某些匿名内部类）。
//        Animal a=new Animal() {
//            @Override
//            public void cry() {
//                System.out.println("小猫喵喵喵");
//            }
//        };
//        a.cry();
        System.out.println("================================================");
        Swim s = () -> {
            System.out.println("学生游泳贼快");

        };
        s.swimming();
    }

//    abstract class Animal {
//        public abstract void cry();
//    }

    //函数式接口：有且仅有一个抽象方法的接口。
    @FunctionalInterface //声明函数式接口的注解。
    interface Swim {
        void swimming();
    }
}



