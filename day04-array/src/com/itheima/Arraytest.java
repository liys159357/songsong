package com.itheima;

public class Arraytest {
    public static void main(String[] args) {
        //目标：完成斗地主游戏的做牌和洗牌
        start();
    }
    public static void start(){
        //1.做牌：创建一个动态初始化的数组，存储54张牌
        String[] poker=new String[54];
        //2.准备四种花色和点数，再开始做牌存入数组中。
        String[] colors={"♥","♠","♣","♦"}; //j
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"}; //i
        //3.遍历点数，在遍历花色
        int index=0;  //定义一个变量，记录牌存储的位置
        for (int i = 0; i < numbers.length; i++) {              //当前点数 numbers[i]
            for (int j = 0; j < colors.length; j++) {            //当前花色 colors[j]
                poker[index++]=colors[j]+numbers[i];
            }
        }
        //4.做牌后，将大王和小王存入数组
        poker[index++]="小王";
        poker[index]="大王";
        //5.打印牌
        System.out.println("新牌：");
        for (int i=0;i<poker.length;i++){
            System.out.print(poker[i]+" ");
        }
        System.out.println();
        //6.洗牌 把54张牌的数组poker中的排顺序打乱
        //第一种洗牌方法：先随机生成一个索引，poker生成的索引与第一位置索引进行交换 第二次就是与第二位进行交换，以此类推
        System.out.println("洗牌后：");
        for (int i=0;i<poker.length;i++){
            int index1=(int)(Math.random()*poker.length);
            String temp=poker[i];
            poker[i]=poker[index1];
            poker[index1]=temp;
            System.out.print(poker[i]+" ");
        }
        System.out.println();
        //第二种洗牌的方法：先随机生成一个数索引，再随机生成一个数索引，交换位置
        for (int i=0;i<poker.length;i++){
            int index2=(int)(Math.random()*poker.length);
            int index3=(int)(Math.random()*poker.length);
            String temp1=poker[index2];
            poker[index2]=poker[index3];
            poker[index3]=temp1;
            System.out.print(poker[i]+" ");
        }
        System.out.println();
    }
}

