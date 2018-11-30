package team.hs.libsys.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Auther: bxan
 * @Date: 2018/11/26 21:49
 * @Description:
 */
public class UserBorrowBookView {
    private JFrame jFrame = new JFrame("借书服务");
    private Container contentPane = jFrame.getContentPane();
    private JLabel userLabel = new JLabel("用户ID");
    private JTextField username = new JTextField();
    private JLabel passwordLabel = new JLabel("目 录 号");
    private JPasswordField password = new JPasswordField();
    private JButton okbtn = new JButton("确定");
    private JButton cancelbtn = new JButton("取消");


    public UserBorrowBookView() {
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
        titlePanel.add(new JLabel("欢迎借书"));
        contentPane.add(titlePanel, "North");

        /*输入部分--Center*/
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        userLabel.setBounds(50, 20, 50, 20);
        passwordLabel.setBounds(50, 60, 50, 20);

        fieldPanel.add(userLabel);
        fieldPanel.add(passwordLabel);

        username.setBounds(110, 20, 120, 20);
        password.setBounds(110, 60, 120, 20);
        fieldPanel.add(username);
        fieldPanel.add(password);

        contentPane.add(fieldPanel, "Center");

        /*按钮部分--South*/
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(okbtn);
        buttonPanel.add(cancelbtn);
        contentPane.add(buttonPanel, "South");

        //为按钮绑定事件
        addlisternerOnLoginView();
    }
    public void disposeJframe(){
        jFrame.dispose();
    }

    public void addlisternerOnLoginView() {
        //确认按下去获取
        okbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String uid = username.getText();
                String bid = String.valueOf(password.getPassword());
                String identity = null;
                System.out.println("用户名--->"+uid);
                System.out.println("密码--->"+bid);

                System.out.println("查询用户是否存在？");

                System.out.println("查询书记是否存在？ 存在是否有剩余？");
//                跳转逻辑到新窗口


                System.out.println("提示结束是否成成？ 若成功返回用户服务页");
                disposeJframe();

            }
        });
        //取消按下去清空
        cancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                password.setText("");
            }
        });    }
}
