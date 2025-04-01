package com.itheima.method1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //姓名 、年龄、 身高、性别
    private String name;
    private int age;
    private double height;
    private char sex;
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
    public int compareByHeight(Student o1,Student o2){
        return Double.compare(o1.getHeight(),o2.getHeight());
    }
}
