package com.itheima.extendsmodifier;

public class Fu {
    private void privateMethod(){
        System.out.println("父类的私有方法");
    }
    void Method(){
        System.out.println("父类的默认方法");
    }
    protected void protectedMethod(){
        System.out.println("父类的受保护方法");
    }
    public void publicMethod(){
        System.out.println("父类的public方法");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privateMethod();
        fu.protectedMethod();
        fu.Method();
        fu.publicMethod();
    }
}
