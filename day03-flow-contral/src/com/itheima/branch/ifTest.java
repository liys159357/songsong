package com.itheima.branch;

public class ifTest {
    public static void main(String[] args) {
    //目标：完成自动汽车驾驶程序的书写，以便可以根据红绿灯状态正确行驶
        drive();
    }
    public static void drive(){
        boolean red=false;
        boolean green=true;
        boolean yellow=false;
        if (red){
            System.out.println("停止！");
        }else if (green) {
            System.out.println("前进！");
        }else if (yellow){
            System.out.println("准备！");
        }else {
            System.out.println("灯坏了，停止！");
        }
    }
}
