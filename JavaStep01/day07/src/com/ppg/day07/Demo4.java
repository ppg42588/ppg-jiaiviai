package com.ppg.day07;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) {
        // 显示日期时间
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(480, 360);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("显示当前时间");
        JLabel jLabel = new JLabel();
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        jLabel.setText(dateFormat.format(date));
        jLabel.setBounds(10, 10, 240, 20);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }
}
