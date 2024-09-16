package com.ppg.day10;

import javax.swing.*;

public class PicuterJFrame extends JFrame {
    public PicuterJFrame() {
        initFrame();
        this.setVisible(true);
    }

    private void initFrame() {
        this.setSize(1080, 720);
        this.setTitle("拼图游戏");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }
}
