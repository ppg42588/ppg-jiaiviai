package com.ppg.vedio.com.itheima_01;

import javax.swing.*;

/*
    void setTitle(String title)：设置窗体标题
    void setLocationRelativeTo(Component c)：设置位置，值为null，则窗体位于屏幕中央
    void setDefaultCloseOperation(int operation)：设置窗体关闭时默认操作(整数3表示：窗口关闭时退出应用程序)
    void setAlwaysOnTop(boolean alwaysOnTop)：设置此窗口是否应始终位于其他窗口之上
 */
public class JFrameDemo02 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        //void setTitle(String title)：设置窗体标题
        jf.setTitle("百度一下，你就知道");
        //设置窗体大小
        jf.setSize(400, 300);
        //void setDefaultCloseOperation(int operation)：设置窗体关闭时默认操作(整数3表示：窗口关闭时退出应用程序)
        jf.setDefaultCloseOperation(3);
        //void setLocationRelativeTo(Component c)：设置位置，值为null，则窗体位于屏幕中央
        jf.setLocationRelativeTo(null);
        //void setAlwaysOnTop(boolean alwaysOnTop)：设置此窗口是否应始终位于其他窗口之上
        jf.setAlwaysOnTop(true);

        //设置窗体可见
        jf.setVisible(true);
    }
}
