package com.itheima.nimingneibulei;

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
}
