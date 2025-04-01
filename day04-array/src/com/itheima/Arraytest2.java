package com.itheima;

public class Arraytest2 {
    public static void main(String[] args) {
        //目标：完成数组华容道的初始化和随机乱序
        start(5);
    }
    public static void start(int n){
        //1.定义一个二维数组存储数字列表
        int[][] arr=new int[n][n];
        //2.遍历二维数组，给二维数组赋值
        int count=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=count++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();}
        //3.打乱二维数组中的元素顺序
        System.out.println("打乱后的数组：");
        for(int k=0;k<arr.length;k++){
            for (int j = 0; j < arr[k].length; j++) {
                int index1=(int)(Math.random()*arr.length);
                int index2=(int)(Math.random()*arr.length);
                int temp=arr[k][j];
                arr[k][j]=arr[index1][index2];
                arr[index1][index2]=temp;
                System.out.print(arr[k][j]+"\t");
                }
                System.out.println();

            }
        }
    }
