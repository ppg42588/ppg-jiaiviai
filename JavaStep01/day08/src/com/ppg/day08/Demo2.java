package com.ppg.day08;

import javax.swing.*;

public class Demo2 {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("聊天室");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(100,100,720,480);

        JTextArea jTextArea=new JTextArea();
        jTextArea.setBounds(10,10,600,380);
        jFrame.add(jTextArea);

        JTextField jTextField=new JTextField();
        jTextField.setBounds(10,400,550,20);
        jFrame.add(jTextField);

        JButton jButton=new JButton("发送");
        jButton.setBounds(570,400,80,20);
        jFrame.add(jButton);

        jFrame.setVisible(true);
    }
}
