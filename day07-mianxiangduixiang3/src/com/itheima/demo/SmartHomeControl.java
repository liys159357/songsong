package com.itheima.demo;
//智能控制系统。
public class SmartHomeControl {
    private Jiadian[] jiadians;
    public SmartHomeControl(Jiadian[] jiadians) {
        this.jiadians = jiadians;
    }
    public void control(Jiadian jiadian) {
        System.out.println(jiadian.getName()+"状态目前是:"+(jiadian.isStatus()?"开着":"关着"));
        System.out.println("开始您的操作：");
        jiadian.press();
        System.out.println(jiadian.getName()+"状态目前是:"+(jiadian.isStatus()?"开着":"关着"));
    }
    public void printAllstatus(Jiadian[] jiadians){
        //使用for循环，根据索引遍历每个设备
        for (int i=0;i<jiadians.length;i++){
            Jiadian jiadian=jiadians[i];
            System.out.println((i+1)+","+jiadian.getName()+"状态目前是:"+(jiadian.isStatus()?"开着":"关着"));
        }
    }
}
