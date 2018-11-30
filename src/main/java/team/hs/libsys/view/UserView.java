package team.hs.libsys.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: bxan
 * @Date: 2018/11/26 21:38
 * @Description: 用户选择服务界面
 */
public class UserView {
    private JFrame jFrame = new JFrame("用户");
    private Container contentPane = jFrame.getContentPane();
    private Button borrowButton = new Button("借书");
    private Button returnButton = new Button("还书");

    public UserView() {
        //设置窗体的位置及大小
        jFrame.setBounds(600, 200, 300, 220);
        //设置一层相当于桌布的东西
        contentPane.setLayout(new BorderLayout());//布局管理器
        //设置按下右上角X号后关闭
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //初始化--往窗体里放其他控件
        init();
        //设置窗体可见
        jFrame.setVisible(true);


    }

    public void init() {

        /*标题部分--North*/
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("服务选择"));
        contentPane.add(titlePanel, "North");

        /*输入部分--Center*/
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout( new FlowLayout());

        fieldPanel.add(borrowButton);
        fieldPanel.add(returnButton);
        contentPane.add(fieldPanel, "Center");

        //为按钮绑定事件
        addlisternerOnLoginView();
    }
    public void disposeJframe(){
        jFrame.dispose();
    }

    public void addlisternerOnLoginView() {
        //确认按下去获取

        borrowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("跳转用户借书页面");
                new UserBorrowBookView();
                jFrame.dispose();
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("跳转用户还书界面");
                jFrame.dispose();
            }
        });


    }

}
