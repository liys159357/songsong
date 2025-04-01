package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//自定义的登录界面：认JFrame做爸爸。
public class Loginframe extends JFrame implements ActionListener {
    public Loginframe() {
        //设置窗口的标题
        this.setTitle("登录界面");
        //设置窗口大小
        this.setSize(400,300);
        //设置窗口位置
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();//初始化这个窗口上的组件
    }

    private void init() {
        //添加一个登录按钮
        JButton btn = new JButton("登录");
        btn.addActionListener(this);//添加监听器

        JPanel panel = new JPanel();
        this.add(panel);

        panel.add(btn);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,"用户点击了登录按钮");
    }
}
