package com.ppg.day07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {
    public static void main(String[] args) {
        // 考勤查询
        JFrame jFrame = new JFrame();
        jFrame.setLayout(null);
        jFrame.setSize(480, 360);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("考勤查询");
        // 开始时间
        JLabel jLabelStart = new JLabel();
        jLabelStart.setBounds(10, 10, 240, 20);
        jFrame.add(jLabelStart);
        // 结束时间
        JLabel jLabelEnd = new JLabel();
        jLabelEnd.setBounds(10, 40, 240, 20);
        jFrame.add(jLabelEnd);
        // 出勤时间满足情况
        JLabel jLabel = new JLabel();
        jLabel.setBounds(10, 70, 140, 20);
        jFrame.add(jLabel);
        // 打卡触发器
        JButton jButton = new JButton();
        jButton.setText("打卡");
        jButton.setBounds(160, 70, 80, 20);
        jFrame.add(jButton);
        // 打卡次数,第一次打卡记录为开始,结束取最后一次打卡
        final int[] times = {0};
        final Date[] date = new Date[2];
        jFrame.setVisible(true);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (times[0] == 0) {
                    date[0] = new Date();
                    jLabelStart.setText("出勤时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date[0]));
                    times[0]++;
                } else {
                    date[1] = new Date();
                    jLabelEnd.setText("退勤时间:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date[1]));
                    times[0]++;
                }
                if (times[0] > 1) {
                    if (date[1].getTime() - date[0].getTime() < 8 * 60 * 60 * 1000) {
                        jLabel.setText("出勤时间不够,早退!");
                    } else {
                        jLabel.setText("正常退勤");
                    }
                }
            }
        });
    }
}
