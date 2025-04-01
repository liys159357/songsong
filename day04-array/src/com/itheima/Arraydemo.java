package com.itheima;

public class Arraydemo {
    public static void main(String[] args) {
        System.out.println(getName() + "回答问题");
    }

    //我是一个Java初学者，帮我开发一个随机点名的方法，假设有15个学生
    public static String getName() {
        //定义一个数组，存储15个学生的成绩
        String[] names = {"小明", "小红", "小刚", "小花", "小李", "小王", "小赵", "小钱", "小孙", "小李", "小周", "小吴", "小郑", "小王", "小冯"};
        //随机获取一个索引
        int index = (int) (Math.random() * names.length);
        //返回索引对应的元素
        return names[index];
    }
}
