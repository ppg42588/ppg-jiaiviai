package com.ppg.day07;

import javax.swing.*;

public class Main{
    public static void main(String[] args) {
        UserLoginFrame userLoginFrame=new UserLoginFrame();
        // 用户名
        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 10, 240, 20);
        userLoginFrame.add(jTextField);
        // 密码
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(10, 40, 240, 20);
        userLoginFrame.add(jPasswordField);
        // 登录
        JButton jButtonLogin = new JButton();
        jButtonLogin.setText("登录");
        jButtonLogin.setBounds(10, 70, 60, 20);
        userLoginFrame.add(jButtonLogin);
        // 注册
        JButton jButtonSign = new JButton();
        jButtonSign.setText("注册");
        jButtonSign.setBounds(80, 70, 60, 20);
        userLoginFrame.add(jButtonSign);
        // 忘记密码
        JButton jButtonForgetPasswd = new JButton();
        jButtonForgetPasswd.setText("忘记密码");
        jButtonForgetPasswd.setBounds(150, 70, 100, 20);
        userLoginFrame.add(jButtonForgetPasswd);
        userLoginFrame.setVisible(true);
        // 登录操作
        jButtonLogin.addActionListener(e -> {
            if ("ppg".equals(jTextField.getText())
                    && "123456".equals(new String(jPasswordField.getPassword()))) {
                JOptionPane.showMessageDialog(userLoginFrame, "登录成功");
            } else {
                JOptionPane.showMessageDialog(userLoginFrame, "登录失败");
            }
        });
        // 注册操作
        jButtonSign.addActionListener(e -> JOptionPane.showMessageDialog(userLoginFrame, "注册"));
        //忘记密码操作
        jButtonForgetPasswd.addActionListener(e -> JOptionPane.showMessageDialog(userLoginFrame, "忘记密码"));
    }
}