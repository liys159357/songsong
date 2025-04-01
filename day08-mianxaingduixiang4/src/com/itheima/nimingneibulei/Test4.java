package com.itheima.nimingneibulei;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        //目标：完成给数组排序，理解其中匿名内部类的用法
        //准备一个学生类型的数组，存放6个学生
        Student[] students=new Student[6];
        students[0]=new Student("小明", 23, 170, '男');
        students[1]=new Student("小红", 21, 160, '女');
        students[2]=new Student("小刚", 22, 180, '男');
        students[3]=new Student("小李", 20, 165, '男');
        students[4]=new Student("小王", 19, 175, '女');
        students[5]=new Student("小赵", 21, 170, '女');
        //目标：按照年龄升序排序，可以调用sun公司写好的API直接对数组进行排序
        //  public static  void sort(T[] a, Comparator<T> c)   T代表类型
        //参数一：代表需要排序的数字
        // 参数2：你需要给sort方法声明一个比较器对象（指定排序的规则）
        //sort会调用匿名内部类compare方法，对数组中的学生对象进行两两比较，从而实现排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //制定排序规则:如果你认为左边对象大于右边对象，那么返回正整数  小于返回负整数  等于返回0

//                if (o1.getAge()>o2.getAge()){
//                    return 1;
//                }else if (o1.getAge()<o2.getAge()){
//                    return -1;
//                }
                return o1.getAge()-o2.getAge();//按照年龄升序
            }
        });
        for (int i = 0; i < students.length; i++) {
            Student s=students[i];
            System.out.println(s);

        }
    }

}
