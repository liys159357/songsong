package com.itheima.method1;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //目标：静态方法引用场景应用
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
        //如果某个Lambda表达式里只是调用一个静态方法，并且“->”前后参数一致，就可以使用静态方法引用
        Arrays.sort(students, Student::compareByAge);
        //静态方法引用：类名::静态方法名
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(s);

        }
    }
}
