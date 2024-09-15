package com.ppg.day08;

import javax.swing.*;

public class Demo1 {
    public static void main(String[] args) {
        MyJFrame myJFrame = new MyJFrame();

        JLabel startTimeLabel = new JLabel("开始时间");
        startTimeLabel.setBounds(50, 50, 80, 20);
        myJFrame.add(startTimeLabel);

        JTextField startTimeText = new JTextField();
        startTimeText.setBounds(150, 50, 80, 20);
        myJFrame.add(startTimeText);

        JLabel endTimeLabel = new JLabel("结束时间");
        endTimeLabel.setBounds(50, 100, 80, 20);
        myJFrame.add(endTimeLabel);

        JTextField endTimeText = new JTextField();
        endTimeText.setBounds(150, 100, 80, 20);
        myJFrame.add(endTimeText);

        myJFrame.setVisible(true);
    }
}
