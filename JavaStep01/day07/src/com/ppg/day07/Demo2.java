package com.ppg.day07;

import javax.swing.*;

public class Demo2 {
    public static void main(String[] args) {
        // 聊天室实现
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(480, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("聊天室");
        // 聊天框
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(10, 10, 450, 300);
        jFrame.add(jTextArea);
        // 输入框
        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 320, 370, 20);
        jFrame.add(jTextField);
        //发送按钮
        JButton jButton = new JButton();
        jButton.setText("发送");
        jButton.setBounds(390, 320, 60, 20);
        jFrame.add(jButton);
        jFrame.setVisible(true);
        // 发送操作
        jButton.addActionListener(e -> {
            String text = jTextField.getText().trim();
            String textArea = jTextArea.getText();
            if (!text.isEmpty()) {
                if (textArea.length() == 0) {
                    jTextArea.setText(text);
                } else {
                    jTextArea.setText(textArea + "\n" + text);
                }
            }
        });

    }
}
