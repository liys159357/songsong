package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        //目标：第一种写法：提供实现类，创建实现类对象代表事件监听对象。
        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();   //创建一个面板
        jf.add(panel);  //将面板添加到窗口中

        jf.setSize(400, 300); //设置窗口大小
        jf.setLocationRelativeTo(null);    //设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭窗口默认操作：关闭窗口退出程序

        JButton jb = new JButton("登录");  //创建一个按钮
        panel.add(jb);  //将按钮添加到面板中

        jb.addActionListener(new MyActionListener(jf));

        jf.setVisible(true);
    }
}
//实现类
class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf, "有人点击了登录!");
    }
}
