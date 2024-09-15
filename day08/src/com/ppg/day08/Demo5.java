package com.ppg.day08;

import javax.swing.*;

public class Demo5 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setTitle("用户登录");
        jFrame.setDefaultCloseOperation(3);
        jFrame.setBounds(100, 100, 720, 480);

        JTextField jTextField=new JTextField();
        JPasswordField jPasswordField=new JPasswordField();
        JButton jButton=new JButton("登录");
        JButton jButton1=new JButton("注册");
        JButton jButton2=new JButton("忘记密码");

        jTextField.setBounds(10,10,250,20);
        jPasswordField.setBounds(10,40,250,20);
        jButton.setBounds(10,70,60,20);
        jButton1.setBounds(90,70,60,20);
        jButton2.setBounds(170,70,100,20);

        jFrame.add(jTextField);
        jFrame.add(jPasswordField);
        jFrame.add(jButton);
        jFrame.add(jButton1);
        jFrame.add(jButton2);

        jFrame.setVisible(true);
    }
}
