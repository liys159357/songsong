package com.itheima.extendsdemo;

public class Test {
    public static void main(String[] args) {
        //目标：认识继承
        //1.创建对象，封装老师数据
        //子类可以继承父类的非私有成员 也就是get、set方法
        //子类对象其实是由子类和父类多张设计图共同创建的
        Teacher t=new Teacher();
        t.setName("小明");
        t.setSkill("java");
        t.setSex('男');
        System.out.println(t.getName()+","+t.getSex()+","+t.getSkill());

        Zixunshi z=new Zixunshi();
        z.setName("小红");
        z.setSex('女');
        z.setNumber(123);
        System.out.println(z.getName()+","+z.getSex()+","+z.getNumber());
    }
}
