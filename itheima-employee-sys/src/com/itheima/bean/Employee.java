package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//员工信息包括"ID", "姓名","性别","电话", "年龄"，"职位","入职时间","薪水", "部门信息"
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String phone;
    private String position;
    private String entryDate;
    private double salary;
    private String department;
}
