package com.tiheima;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//自定义窗口类，创建对象，展示一个主窗口。
public class MainFrame extends JFrame {
    //设置图片位置
    private static final String IMAGEPATH="stone-maze/src/image/";
    //准备一个数组，用户存储数字色块的行列位置：4行4列
    private int[][] imageData={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //定义一个二维数组，用来存储最终游戏成功的数据。
    private  int[][] winData=new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };
    //定义两个整数变量记录当前空白色块的位置
    private int row; //行索引
    private int col;  //列索引
    private int count; //统计总共移动的步数。
    private int minCount; //历史胜利最少步数
    public MainFrame(){
        minCount=readFileScore();
        System.out.println("当前最小步数是："+minCount);
        //1.调用初始化方法:初始化窗口大小等信息。
        initFrame();
        //4.打乱数字色块的顺序，再展示图片
        initRandomArray();
        //2.初始化界面：展示数字色块
        initImage();
        //3.初始化系统菜单:点击弹出菜单信息是系统退出，重启游戏
        initMenu();
        //给当前窗口绑定上下左右按键事件。
        initKeyPressEvent();
        //设置窗口的显示
        this.setVisible(true);

    }

    private void initKeyPressEvent() {
        //给当前窗口绑定上下左右按键事件。
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //获取当前按键的编号
                int keyCode=e.getKeyCode();
                //判断这个编号是否是上下左右按键
                switch (keyCode){
                    case KeyEvent.VK_UP:    //用户按了上键，让图片向上移动
                        switchAndMove(Direction.UP);
                        break;
                    case KeyEvent.VK_DOWN:
                        switchAndMove(Direction.DOWN);
                        break;
                    case KeyEvent.VK_LEFT:
                        switchAndMove(Direction.LEFT);
                        break;
                    case KeyEvent.VK_RIGHT:
                        switchAndMove(Direction.RIGHT);
                        break;
                }
            }
        });
    }

    //控制数据交换和图片移动
    private void switchAndMove(Direction direction){
        //判断图片的方向，控制图片移动.
        switch (direction) {
            case UP:
                //上交换条件是行必须<3，然后才开始交换
                if (row<imageData.length-1){
                    //交换数据
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row+1][col];
                    imageData[row+1][col]=temp;
                    //更新当前空白色块的位置
                    row++;
                    count++;
                }
                break;
            case DOWN:
                //下交换的条件是行必须>0，然后才开始交换
                if (row>0){
                    //交换数据
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row-1][col];
                    imageData[row-1][col]=temp;
                    //更新当前空白色块的位置
                    row--;
                    count++;
                }
                break;
            case LEFT:
                //左交换的条件是列必须<3，然后才开始交换
                if (col<imageData.length-1){
                    //交换数据
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row][col+1];
                    imageData[row][col+1]=temp;
                    //更新当前空白色块的位置
                    col++;
                    count++;
                }
                break;
            case RIGHT:
                //右交换的条件是列必须>0，然后才开始交换
                if (col>0){
                    //交换数据
                    int temp=imageData[row][col];
                    imageData[row][col]=imageData[row][col-1];
                    imageData[row][col-1]=temp;
                    //更新当前空白色块的位置
                    col--;
                    count++;
                }
                break;
        }
        //重新刷新界面
        initImage();
    }

    private void initRandomArray() {
        //打乱二位数字中的元素顺序。
        for (int i = 0; i < imageData.length; i++){
            for (int j = 0; j < imageData[i].length; j++){
                int i1=(int)(Math.random()*imageData.length);
                int i2=(int)(Math.random()*imageData[i].length);

                int j1=(int)(Math.random()*imageData.length);
                int j2=(int)(Math.random()*imageData[i].length);
                int temp=imageData[i1][i2];
                imageData[i1][i2]=imageData[j1][j2];
                imageData[j1][j2]=temp;
            }
        }
        //定位空白色块的位置。
        //去二维数组中遍历每个数据，只要发现这个数据等于0,这个位置就是当前空白色块的位置。
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j]==0){
                    row=i;
                    col=j;
                    break OUT;  //跳出循环
                }
            }
        }
    }

    private void initMenu() {
        JMenuBar menuBar=new JMenuBar(); //创建一个菜单条
        JMenu menu=new JMenu("系统");//创建第一个菜单
        JMenuItem exitJi=new JMenuItem("退出");
        menu.add(exitJi);  //添加一个菜单项
        exitJi.addActionListener(e -> {
            dispose();//销毁
        });
        JMenuItem restarJi=new JMenuItem("重新开始");
        menu.add(restarJi);
        restarJi.addActionListener(e -> {
            //重新开始游戏：重新打乱二维数组的顺序
            count=0;
            initRandomArray();
            initImage();
        });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }

    private void initImage() {
        //先清空窗口上的全部图层
        this.getContentPane().removeAll();
        //刷新界面时，可以给界面显示步数
        JLabel countTxt=new JLabel("步数："+count+"步");
        countTxt.setBounds(20,20,100,20);
        //文字展示成红色,加粗
        countTxt.setForeground(Color.red);
        countTxt.setFont(new Font("微软雅黑",Font.BOLD,16));
        this.add(countTxt);
        //问一问是不是第一次玩游戏，展示还没有历史胜利步数.
        if (minCount!=0){
            JLabel countTxt2=new JLabel("历史最小步数："+minCount+"步");
            countTxt2.setBounds(300,20,130,20);
            //文字展示成红色,加粗
            countTxt2.setForeground(Color.BLUE);
            countTxt2.setFont(new Font("微软雅黑",Font.BOLD,12));
            this.add(countTxt2);
        }else {
            JLabel countTxt2=new JLabel("，没有历史步数");
            countTxt2.setBounds(300,20,130,20);
            //文字展示成红色,加粗
            countTxt2.setForeground(Color.BLUE);
            countTxt2.setFont(new Font("微软雅黑",Font.BOLD,12));
            this.add(countTxt2);
        }

        //判断是否赢了。
        if (isWin()){
            //展示胜利的图片
            JLabel winLabel=new JLabel(new ImageIcon(IMAGEPATH+"win.png"));
            winLabel.setBounds(124,230,266,88);
            this.add(winLabel);

            //读取文件中的最小步数，看是否需要更新。
            int score=readFileScore();
            //判断步数是否是0，是0说明第一次玩游戏，直接写入当前胜利的步数
            if (score==0||minCount<score){
                writeFileScore(minCount);
            }
        }
        //1.展示一个行列矩阵的图片色块一次铺满窗口(4行4列)
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //拿到图片名称
                String imageName=imageData[i][j]+".png";
                //2.创建一个JLabel对象，设置图片给他展示。
                JLabel label=new JLabel();
                //3.设置图片到label对象中去。
                label.setIcon(new ImageIcon(IMAGEPATH+imageName));
                //4.设置图片位置展示出来.
                label.setBounds(20+j*100,60+i*100,100,100);
                //5.把这个图片展示到窗口上去
                this.add(label);
            }
        }
        //设置窗口的背景图片
        JLabel background=new JLabel(new ImageIcon(IMAGEPATH+"background.png"));
        background.setBounds(0,0,450,484);
        this.add(background);
        //在刷新新图层，重新绘制
        this.repaint();
    }
    //把当前最少步数写入到文件中去更新
    private void writeFileScore(int minCount) {
        try(
        FileWriter fw=new FileWriter("G:\\java项目\\javaseaiproject\\stone-maze\\src\\score.txt");
        )
        {//把当前步数写入到文件中去更新
        fw.write(count+"");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //读取score.txt文件中的最小步数
    private int readFileScore() {
        try {
            //1.读取文件中的最小步数
            FileReader fr=new FileReader("G:\\java项目\\javaseaiproject\\stone-maze\\src\\score.txt");
            BufferedReader br=new BufferedReader(fr);
            String line = br.readLine();
            return Integer.valueOf(line);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private boolean isWin() {
        //判断游戏二维数组和赢了之后二维数组是否一样
        for (int i = 0; i <winData.length; i++) {
            for (int j = 0; j < winData[i].length; j++) {
                if (imageData[i][j]!=winData[i][j]){
                    return false;
                }
            }
        }
        return true;
    }

    private void initFrame() {
        //设置窗口标题
        this.setTitle("石头迷阵");
        //设置窗口的宽高
        this.setSize(465,580);
        //设置窗口的关闭方式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口的居中显示
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }

}
