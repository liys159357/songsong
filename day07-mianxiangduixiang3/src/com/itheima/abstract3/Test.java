package com.itheima.abstract3;

public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的使用场景之一：模版方法设计模式
        //学生和老师都要写一篇作文：《我的爸爸》  第一段一样，第二段不一样，第三段一样
        //解决：抽出一个父类，父类中还抽取一个模版方法给子类直接使用
        Student s = new Student();
        s.write();
        Techer t = new Techer();
        t.write();
    }
}
