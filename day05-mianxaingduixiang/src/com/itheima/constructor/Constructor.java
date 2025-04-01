package com.itheima.constructor;
//构造器
public class Constructor {
    public static void main(String[] args) {
        //目标：认识类的构造器，搞清楚其特点和常见的应用场景
        Student s1=new Student();    //构造器特点：创建对象时，会自动调用无参构造器
        Student s2=new Student("小明");
        System.out.println("========================================");
        Student t1=new Student();
        t1.name="小明";
        t1.age=18;
        t1.sex='男';
        System.out.println(t1.name+","+t1.age+","+t1.sex);

        //对象的一种常见应用场景，创建对象时可以立即为对象赋值
        Student t2=new Student("小红",19,'女');
        System.out.println(t2.name+","+t2.age+","+t2.sex);
    }
}
