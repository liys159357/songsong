package com.itheima.interface3;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚接口新增的三种方法，并理解其好处
        B a=new B();
        a.go();

        A.write();
    }
}
class B implements A{}
