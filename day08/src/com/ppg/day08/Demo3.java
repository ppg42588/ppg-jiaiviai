package com.ppg.day08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("猜数字");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(100, 100, 720, 480);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 10, 80, 20);
        jFrame.add(jTextField);

        JButton jButton = new JButton("我猜");
        jButton.setBounds(100, 10, 60, 20);
        jFrame.add(jButton);

        JLabel jLabel = new JLabel("请输入数字（1-100）");
        jLabel.setBounds(10, 40, 120, 20);
        jFrame.add(jLabel);

        int num = new Random().nextInt(100) + 1;

        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int test = Integer.parseInt(jTextField.getText());
                if (test < num) {
                    jLabel.setText("小了");
                } else if (test > num) {
                    jLabel.setText("大了");
                } else {
                    jLabel.setText("对了");
                    return;
                }

            }
        });

        jFrame.setVisible(true);
    }
}
