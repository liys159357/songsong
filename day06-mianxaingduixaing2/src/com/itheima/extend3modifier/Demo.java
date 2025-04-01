package com.itheima.extend3modifier;

import com.itheima.extendsmodifier.Fu;

public class Demo extends Fu{
    public static void main(String[] args) {
        Fu fu = new Fu();
//        fu.privateMethod();
//       fu.protectedMethod();
//        fu.Method();
        fu.publicMethod();
    }
    public void print(){
        protectedMethod();
        publicMethod();
    }
}
