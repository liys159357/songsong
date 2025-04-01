package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        //目标：学会创建对象  创建对象的格式：类名 对象名=new 类名();
        Star s1=new Star();
        s1.name="李岩松";
        s1.age=18;
        s1.gender="男";
        s1.height=175;
        s1.weight=90;
        System.out.println(s1.name+" "+s1.age+" "+s1.gender+" "+s1.height+" "+s1.weight);
    }
}
