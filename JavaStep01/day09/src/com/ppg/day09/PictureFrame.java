package com.ppg.day09;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PictureFrame extends JFrame {
    private int indexX0 = 0;  // 记录0号图片的列索引
    private int indexY0 = 0;  // 记录0号图片的行索引

    public PictureFrame() {
        initFrame();
        paintView();
        this.setVisible(true);
    }

    private void initFrame() {
        this.setLayout(null);
        this.setSize(960, 565);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setTitle("拼图");
    }

    private void paintView() {
        final int[][][] imageArr = {randomDate(1)};
        // 背景添加
        JLabel jLabelBackGround = new JLabel();
        jLabelBackGround.setBounds(0, 0, 960, 530);
        jLabelBackGround.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\background.png"));
        // 添加标题
        JLabel jLabelTitle = new JLabel();
        jLabelTitle.setBounds(354, 27, 232, 57);
        jLabelTitle.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\title.png"));
        jLabelBackGround.add(jLabelTitle);
        // 添加参考图片
        JLabel jLabelReference = new JLabel();
        jLabelReference.setBounds(574, 114, 122, 121);
        jLabelReference.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\canzhaotu.png"));
        jLabelBackGround.add(jLabelReference);
        // 添加向左
        JButton jButtonLeft = new JButton();
        jButtonLeft.setBounds(650, 347, 57, 57);
        jButtonLeft.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\zuo.png"));
        jLabelBackGround.add(jButtonLeft);
        // 添加向右
        JButton jButtonRight = new JButton();
        jButtonRight.setBounds(813, 347, 57, 57);
        jButtonRight.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\you.png"));

        jLabelBackGround.add(jButtonRight);
        // 添加向上
        JButton jButtonUp = new JButton();
        jButtonUp.setBounds(732, 265, 57, 57);
        jButtonUp.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\shang.png"));
        jLabelBackGround.add(jButtonUp);
        // 添加向下
        JButton jButtonDown = new JButton();
        jButtonDown.setBounds(732, 347, 57, 57);
        jButtonDown.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\xia.png"));
        jLabelBackGround.add(jButtonDown);
        // 添加求助
        JButton jButtonHelp = new JButton();
        jButtonHelp.setBounds(626, 444, 108, 45);
        jButtonHelp.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\qiuzhu.png"));
        jLabelBackGround.add(jButtonHelp);
        // 添加重置
        JButton jButtonRest = new JButton();
        jButtonRest.setBounds(786, 444, 108, 45);
        jButtonRest.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\chongzhi.png"));
        jLabelBackGround.add(jButtonRest);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBounds(150, 114, 360, 360);
        showPicture(jPanel, indexPicture(imageArr[0]));

        // 向上移动
        jButtonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indexY0 != 0) {
                    int temp = imageArr[0][indexY0][indexX0];
                    imageArr[0][indexY0][indexX0] = imageArr[0][indexY0 - 1][indexX0];
                    imageArr[0][indexY0 - 1][indexX0] = temp;
                    indexY0--;
                    showPicture(jPanel, indexPicture(imageArr[0]));
                }
            }
        });

        // 向下移动
        jButtonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indexY0 != imageArr[0].length - 1) {
                    int temp = imageArr[0][indexY0][indexX0];
                    imageArr[0][indexY0][indexX0] = imageArr[0][indexY0 + 1][indexX0];
                    imageArr[0][indexY0 + 1][indexX0] = temp;
                    indexY0++;
                    showPicture(jPanel, indexPicture(imageArr[0]));
                }
            }
        });

        // 向左移动
        jButtonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indexX0 != 0) {
                    int temp = imageArr[0][indexY0][indexX0];
                    imageArr[0][indexY0][indexX0] = imageArr[0][indexY0][indexX0 - 1];
                    imageArr[0][indexY0][indexX0 - 1] = temp;
                    indexX0--;
                    showPicture(jPanel, indexPicture(imageArr[0]));
                }
            }
        });

        // 向右移动
        jButtonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (indexX0 != imageArr[0][indexY0].length - 1) {
                    int temp = imageArr[0][indexY0][indexX0];
                    imageArr[0][indexY0][indexX0] = imageArr[0][indexY0][indexX0 + 1];
                    imageArr[0][indexY0][indexX0 + 1] = temp;
                    indexX0++;
                    showPicture(jPanel, indexPicture(imageArr[0]));
                }
            }
        });

        // 重置游戏
        jButtonRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageArr[0] =randomDate(1);
                showPicture(jPanel, indexPicture(imageArr[0]));
            }
        });

        // 还原原图
        jButtonHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPicture(jPanel, indexPicture(randomDate(0)));
            }
        });

        this.add(jPanel);
        this.add(jLabelBackGround);

    }

    private int[][] randomDate(int select) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };
        if (select == 0) {
            arr[3][3] = 16;
            return arr;
        }
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(indexY0+" "+indexX0);
                int indexX = random.nextInt(arr[i].length);
                int indexY = random.nextInt(arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[indexY][indexX];
                arr[indexY][indexX] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){
                    indexY0=i;
                    indexX0=j;
                }
            }
        }

        return arr;
    }

    private JLabel[][] indexPicture(int[][] imageArr) {
        JLabel[][] jLabels = new JLabel[4][4];
        int num = 0;
        for (int i = 0; i < imageArr.length; i++) {
            for (int j = 0; j < imageArr[i].length; j++) {
                JLabel jLabel = new JLabel();
                jLabel.setBounds(j * 90, i * 90, 90, 90);
                jLabel.setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\" + imageArr[i][j] + ".png"));
                jLabels[i][j] = jLabel;
                if (imageArr[i][j] == i * 4 + j + 1) num++;
            }
        }
        if (num == 15) {
            JOptionPane.showMessageDialog(this, "挑战成功");
            imageArr[3][3] = 16;
            jLabels[3][3].setIcon(new ImageIcon("day09\\src\\com\\ppg\\images\\" + imageArr[3][3] + ".png"));
        }
        return jLabels;
    }

    private void showPicture(JPanel jPanel, JLabel[][] jLabel) {
        jPanel.removeAll();
        jPanel.repaint();
        for (int i = 0; i < jLabel.length; i++) {
            for (int j = 0; j < jLabel[i].length; j++) {
                jPanel.add(jLabel[i][j]);
            }
        }
        this.add(jPanel);
    }
}
