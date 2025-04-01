package com.itheima.zileigouzaoqi;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器的特点，再看应用场景
        //子类构造器必须先调用父类的无参数构造器，在执行自己的构造器
        Zi z=new Zi();

    }
}
class Fu{
    public Fu(){
        System.out.println("父类无参数构造器");
    }
    public Fu(int a){
        System.out.println("父类有参数构造器");
    }
}
class Zi extends Fu{

    public Zi(){
//        super();//默认存在的，写不写都有
        System.out.println("子类无参数构造器");
    }

    }

