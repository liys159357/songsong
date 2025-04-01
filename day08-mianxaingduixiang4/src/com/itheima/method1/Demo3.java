package com.itheima.method1;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        //目标：特定类型的方法引用。
        //需求：有一个字符串数组，里面有一些人的名字都英文，请按照名字的首字母升序排序。
        String[] names = {"Jack","Rose","Lucy","Tom","Jerry","caocao","tudou","angela","Andy","Bobi","曹操"};
        //把这个数组进行排序：Arrays.sort(names, Comparator)
        //要求：忽略首字母的大小进行升序排序(Java官方默认是搞不定的，需要自己指定比较规则)
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);//字符串按照首字母比较(忽略大小写)的方法:compareToIgnoreCase
//            }
//        });

//        Arrays.sort(names,(o1,o2)->o1.compareToIgnoreCase(o2));
        //特定类型方法引用：类型名称::方法名
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
        }

    }

