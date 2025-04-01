package com.itheima.nimingneibulei;

public class Test2 {
    public static void main(String[] args) {
        //目标：匿名内部类的使用形式（语法）：通常可以作为一个对象参数传输给方法使用
        //需求:学生、老师都要参加游泳比赛
        Swim s=new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳");
            }
        };
        start(s);

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师游泳");
            }
        });
    }
    public static void start(Swim s){
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }
}
