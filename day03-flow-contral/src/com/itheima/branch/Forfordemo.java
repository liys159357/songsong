package com.itheima.branch;

public class Forfordemo {
    public static void main(String[] args) {
    //打印四行五列的星
    printStar();
    //打印九九乘法表
    printStar2();
    }
    public static void printStar(){
        for (int i = 0; i < 4; i++) {
            for (int j=0; j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStar2(){
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
