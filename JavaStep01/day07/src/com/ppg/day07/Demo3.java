package com.ppg.day07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Demo3 {
    public static void main(String[] args) {
        // 猜数字实现
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(480, 360);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("猜数字");
        // 提示框
        JLabel jLabel = new JLabel();
        jLabel.setText("请输入猜测的数字(1~10000):");
        jLabel.setBounds(10, 10, 400, 20);
        jFrame.add(jLabel);
        // 输入框
        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 40, 150, 20);
        jFrame.add(jTextField);
        // 确认按钮
        JButton jButtonConfirm = new JButton();
        jButtonConfirm.setText("我猜:");
        jButtonConfirm.setBounds(170, 40, 100, 20);
        jFrame.add(jButtonConfirm);
        // 重置按钮
        JButton jButtonReStart = new JButton();
        jButtonReStart.setText("重新开始");
        jButtonReStart.setBounds(60, 70, 100, 20);
        jFrame.add(jButtonReStart);
        // 直接显示结果按钮
        JButton jButtonShowNum = new JButton();
        jButtonShowNum.setText("直接显示结果");
        jButtonShowNum.setBounds(170, 70, 160, 20);
        jFrame.add(jButtonShowNum);
        jFrame.setVisible(true);

        Random random = new Random();
        final int[] numGass = {random.nextInt(10000) + 1};
        final int[] start = {1};
        final int[] end = {10000};

        // 确认操作
        jButtonConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTextField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(jFrame, "输入不能为空!");
                    return;
                }
                int numCin = Integer.parseInt(jTextField.getText());
                if (numCin > numGass[0]) {
                    if (numCin < end[0]) end[0] = numCin;
                    jLabel.setText("猜大了,请输入" + start[0] + "~" + end[0] + "间的数字:");
                } else if (numCin < numGass[0]) {
                    if (numCin > start[0]) start[0] = numCin;
                    jLabel.setText("猜小了,请输入" + start[0] + "~" + end[0] + "间的数字:");
                } else {
                    jLabel.setText("猜对了,这个数字是:" + numGass[0]);
                }
            }
        });
        // 重置操作
        jButtonReStart.addActionListener(e -> {
            numGass[0] = random.nextInt(10000) + 1;
        });
        // 直接显示操作
        jButtonShowNum.addActionListener(e -> {
            jLabel.setText(String.valueOf(numGass[0]));
        });
    }
}