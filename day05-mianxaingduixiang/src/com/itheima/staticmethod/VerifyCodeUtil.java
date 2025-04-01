package com.itheima.staticmethod;
//静态方法设计工具类
public final class VerifyCodeUtil {
    //工具类没有创建对象的必要性，所以建议私有化构造器
    private VerifyCodeUtil(){}
    public static String getCode(int n) {
        String code = "";   //记录验证码
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 10);   //数字0-9
            char ch = (char) (Math.random() * 26 + 'a');  //小写字母a-z
            char ch1 = (char) (Math.random() * 26 + 'A');  //大写字母A-Z
            int type = (int) (Math.random() * 3);   //为当前位置随机生成一个数字或大写字母或小写字母 数字为0，小写字母为1，大写字母为2
            switch (type) {
                case 0:
                    code = code + num;
                    break;
                case 1:
                    code = code + ch;
                    break;
                case 2:
                    code = code + ch1;
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
        return code;
    }

}

