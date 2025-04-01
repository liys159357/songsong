package com.itheima.method1;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        //目标：实例方法引用，一个场景
        test();
    }
    public static void test() {
        Student[] students = new Student[6];
        students[0] = new Student("小明", 23, 170, '男');
        students[1] = new Student("小红", 21, 160, '女');
        students[2] = new Student("小刚", 22, 180, '男');
        students[3] = new Student("小李", 20, 165, '男');
        students[4] = new Student("小王", 19, 175, '女');
        students[5] = new Student("小赵", 21, 170, '女');
        //如果某个Lambda表达式里只是通过对象名称调用一个实例方法，并且->前后参数形式一致，就可以使用实例方法引用
        Student t=new Student();
//        Arrays.sort(students,(o1,o2)->t.compareByHeight(o1,o2));
        Arrays.sort(students, t::compareByHeight);
        //实例方法引用：对象名::静态方法名
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);

        }
    }
}
