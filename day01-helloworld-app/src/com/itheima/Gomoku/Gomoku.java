package com.itheima.Gomoku;

import javax.swing.*;

public class Gomoku {
    public static void main(String[] args) {
        JFrame frame = new JFrame("五子棋");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLocationRelativeTo(null);
        frame.add(new GomokuPanel());
        frame.setVisible(true);
    }
}
