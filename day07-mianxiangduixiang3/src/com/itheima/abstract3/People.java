package com.itheima.abstract3;

public abstract class People {
    public final void write(){
        System.out.println("\t\t\t《我的》");
        System.out.println("\t哈喽");
        //模版方法知道子类一定要写这个正文，但是每个子类写的新信息是不同的，父类定义一个抽象方法
        //具体实现交给子类
        writeMain();
        System.out.println("\t你好");
    }
    public abstract void writeMain();
}
