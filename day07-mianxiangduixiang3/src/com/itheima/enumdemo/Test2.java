package com.itheima.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //掌握枚举类的应用场景：做信息的分类和标志。
        //需求：模拟上下左右移动图片。
        //第一种是常量做信息标志和分类：但参数值不受约束
//        move(Changliangfangfa.UP);
        //第二种方式枚举做信息标志和分类：参数值受枚举类约束
        move2(Direction.LEFT);
    }
    public static void move2(Direction direction){
        //根据这个方向做移动，上下左右
        switch(direction){
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
        }
    }
}
