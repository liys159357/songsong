package com.itheima.neibulei;

public class Outer {
    //成员内部类：无static修饰，属于外部类的对象持有的
    public class Inner{
        public void show(){
            System.out.println("show");
        }
    }
}
