package com.itheima.method;

public class Method3 {
    public static void main(String[] args) {
        div(10,0);
        div(10,2);

    }
    //定义一个无返回值的方法，设计一个除法的功能
    public static void div(int a,int b){
        if (b==0){
            System.out.println("除数不能为0");
            return;//提前结束方法。  卫语言风格！
        }
        System.out.println(a/b);
    }

}
