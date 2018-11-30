package xd.an.test;

import javax.swing.*;
import java.awt.*;

/**
 * @Auther: bxan
 * @Date: 2018/11/26 21:06
 * @Description:
 */
public class TestcheckBox extends JFrame {
    JPanel jp1,jp2,jp3;
    JButton jb1,jb2;
    JLabel jl1,jl2;
    JCheckBox jc1,jc2,jc3;
    JRadioButton jr1,jr2;
    ButtonGroup bg;

    public TestcheckBox(){
        init();

    }

    public void init(){
        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();


        jb1=new JButton("注册");
        jb2=new JButton("取消");

        jl1=new JLabel("特长");
        jl2=new JLabel("性别");

        jc1=new JCheckBox("音乐");
        jc2=new JCheckBox("体育");
        jc3=new JCheckBox("文艺");

        jr1=new JRadioButton("男");
        jr2=new JRadioButton("女");

        bg=new ButtonGroup();//将单选按钮添加到组，使其只能选择一个
        bg.add(jr1);
        bg.add(jr2);

        jp1.add(jl1);
        jp1.add(jc1);
        jp1.add(jc2);
        jp1.add(jc3);

        jp2.add(jl2);
        jp2.add(jr1);
        jp2.add(jr2);

        jp3.add(jb1);
        jp3.add(jb2);


        this.setLayout(new GridLayout(3,1));
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setTitle("担心");
        this.setSize(400,320);
        this.setLocation(100, 180);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
