package com.itheima.interface3;

public interface A {
    //1.默认方法（普通实例方法）:必须加default修饰。默认用public修饰
    //如何调用？使用接口的实现类的对象来调用
    default void go(){
        System.out.println("go go go");
        run();
    }
    //2.私有方法（JDK9开始才支持）
    //如何调用？使用接口中的其他实例方法来调用
    private void run(){
        System.out.println("run run run");
    }
    //3.静态方法
    //如何调用？只能使用当前接口名来调用
    static void write(){
        System.out.println("write write write");
    }
}
