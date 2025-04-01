package com.itheima.branch;

public class whiledemo2 {
    public static void main(String[] args) {
        //珠穆朗玛峰高度8848860毫米，有一张纸厚度为0.1毫米。请问：改纸张折叠多少次，可以折叠成珠穆朗玛峰的高度
        Height();
    }
    public static void Height(){
        double mountHeight=8848860;
        double paperHeight=0.1;
        int count=0;
        while (paperHeight<mountHeight){
            paperHeight=paperHeight*2;
            count+=1;
        }
        System.out.println(count);
    }
}
