package com.itheima.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统。
        //角色：设备（吊灯、电视机、洗衣机、落地窗......）
        //具备的功能：开和关
        //谁控制他们：智能控制系统(单例对象),控制调用设备的开和关
        //1.定义设备类：创建设备对象代表家里的设备。
        //2.准备这些设备对象，放到数组中，代表整个家庭的设备
        Jiadian[] jds = new Jiadian[4];
        jds[0] = new TV("小米电视", true);
        jds[1] = new Xiyj(" 美的洗衣机", false);
        jds[2] = new Light(" 欧灯", true);
        jds[3] = new Air(" 美的空调", false);
        //3.为每个设备制定一个开和关的功能。定义一个接口，让jiadian实现开关功能.
        //4.创建智能控制系统对象，控制设备开和关
        SmartHomeControl shc = new SmartHomeControl(jds);
        //5.处理电视机。
//        shc.control(jds[0]);
        //6.提示用户操作 a、展示全部设备的当前情况 b、让用户选择哪一个操作
        //打印全部设备的开和关状态
        shc.printAllstatus(jds);
        System.out.println("请选择设备进行操作：");
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        switch (command) {
            case "1":
                shc.control(jds[0]);
                break;
            case "2":
                shc.control(jds[1]);
                break;
            case "3":
                shc.control(jds[2]);
                break;
            case "4":
                shc.control(jds[3]);
                break;
            case "exit":
                System.out.println("退出系统！");
                return;
            default:
                System.out.println("输入错误！");
        }


    }
}
