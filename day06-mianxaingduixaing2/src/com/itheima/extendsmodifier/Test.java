package com.itheima.extendsmodifier;

public class Test {
    public static void main(String[] args) {
        //目标：认识四种权限修饰符的修饰范围
        Fu fu = new Fu();

        fu.protectedMethod();
        fu.Method();
        fu.publicMethod();
    }
}
