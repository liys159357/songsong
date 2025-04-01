package com.itheima.type;

public class type2 {
    public static void main(String[] args) {
        System.out.println(calc(1,2,3.3,'a'));
        System.out.println(calc2((byte)110,(byte)120));
        System.out.println(calc2((byte)110,(byte)120,(byte)130));
    }
    public static double calc(double a,int b,double c ,char r){
        //表达式的最终结果类型是有最高类型
        return a+b+c+r;
    }
    public static int calc2(byte a,byte b){
        // byte short char 愿运算时会直接提升成int运算
        return a+b;
    }
    public static byte calc2(byte a,byte b,byte c){
        byte d=(byte)(a+b+c);
        return d;
    }
}
