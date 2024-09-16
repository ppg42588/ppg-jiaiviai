package com.ppg.day08;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("当前时间");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(100, 100, 720, 480);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(10, 10, 200, 20);
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");
        jLabel.setText(dateFormat.format(date));
        jFrame.add(jLabel);

        jFrame.setVisible(true);


    }
}
