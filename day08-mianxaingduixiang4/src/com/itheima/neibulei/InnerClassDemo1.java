package com.itheima.neibulei;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        //目标：搞清楚成员内部类的语法
        //成员内部类创建对象的格式
        //外部类名称.内部类名称 对象名=new 外部类名称().new 内部类名称();
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
        People.Heart ph=new People().new Heart();
        ph.show();
        //成员内部类访问外部类成员的特点
        //1.成员内部类可以直接访问外部类的成员变量和方法
        //2.成员内部类的实例方法中，可以直接拿到当前寄生的外部类对象：外部类名.this
    }
}

 class People{
    private int heartBeat=100;
    public class Heart{
        private int heartBeat=200;
        public void show(){
            int heartBeat=80;
            System.out.println(heartBeat);
            System.out.println(this.heartBeat);
            System.out.println(People.this.heartBeat);
        }
    }
}
