package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        //目标：搞清楚实体类是啥？搞清楚其基本作用和应用场景
        //实例类的基本作用：创建它的对象，存取数据（封装数据）
        Student s1=new Student("波妞",100,100);
        Student s2=new Student();
        s2.setName("小明");
        s2.setChinese(90);
        s2.setMath(80);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        //实体类在开发中的应用场景
        //创建一个学生的操作对象专门负责对学生对象的数据进行业务处理
        StudentOperator operator=new StudentOperator(s1);
        operator.printAllScore();
        operator.printAvgScore();
    }
}
