package com.itheima.daimakuai;

public class CodeDemo2 {
    //实例代码块：无static修饰，属于对象，每次创建对象时，都会优先执行一次
    //基本作用：初始化对象的实例资源
    {
        System.out.println("实例代码块执行了");
    }
    public static void main(String[] args) {
        //目标：实例代码块
        System.out.println("main方法执行了");
        new CodeDemo2();
    }
}
