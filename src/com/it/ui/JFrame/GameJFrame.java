package com.it.ui.JFrame;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
//  创建二维数组
    int[][]data=new int[4][4];

    public GameJFrame() {
//        初始化界面
        InitJFrame();

//        初始化菜单
        InitJMenuBar();

//        初始化数据
        InitData();
//        初始化图片
        InitImage();

//        设置界面可见
        this.setVisible(true);
    }

    private void InitData() {
//        定义一个一维数组
        int[]arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            int index=random.nextInt(arr.length);
            int value=arr[i];
            arr[i]=arr[index];
            arr[index]=value;
        }


        for(int i=0;i<arr.length;i++){
            data[i/4][i%4]=arr[i];
        }
    }

    private void InitImage() {

        String path = "D:\\IDEA\\project\\java\\src\\com\\it\\ui\\15_puzzle_tiles\\";
        int size = 128;

        // 清空界面
        this.getContentPane().removeAll();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int num = data[i][j];

                // 0 表示空白块，不显示
                if (num == 0) continue;

                ImageIcon icon = new ImageIcon(path + num + ".png");
                JLabel label = new JLabel(icon);

                label.setBounds(j * size, i * size, size, size);

                this.getContentPane().add(label);
            }
        }

        this.getContentPane().repaint();
    }


    private void InitJMenuBar() {
        //        菜单
        JMenuBar MenuBar = new JMenuBar();

//        菜单选项
        JMenu FunctionBar = new JMenu("功能");
        JMenu AboutBar = new JMenu("关于我们");

//        下一级条目
        JMenuItem RegameItem = new JMenuItem("重新游戏");
        JMenuItem ReloginItem = new JMenuItem("重新登录");
        JMenuItem ExitItem = new JMenuItem("退出游戏");

        JMenuItem AccountItem = new JMenuItem("支持打赏");

//        设置界面菜单
        this.setJMenuBar(MenuBar);


//        添加所属菜单
        MenuBar.add(FunctionBar);
        MenuBar.add(AboutBar);

        FunctionBar.add(RegameItem);
        FunctionBar.add(ReloginItem);
        FunctionBar.add(ExitItem);

        AboutBar.add(AccountItem);
    }

    private void InitJFrame() {
        //     1.游戏主界面

//        设置界面大小
        this.setSize(520, 570);
//        设置界面标题
        this.setTitle("华容道小游戏 v1.0");
//        设置界面浮于上方
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        取消默认位置
        this.setLayout(null);


//        创建按钮
        JButton button1 = new JButton("点击");
        button1.setBounds(0, 0, 100, 50);
    }}
