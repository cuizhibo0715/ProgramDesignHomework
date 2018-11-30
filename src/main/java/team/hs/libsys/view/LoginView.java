package team.hs.libsys.view;

import com.sun.codemodel.internal.JOp;
import sun.rmi.runtime.Log;
import team.hs.libsys.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView {
    private JFrame jFrame = new JFrame("登录");
    private Container contentPane = jFrame.getContentPane();
    private JLabel userLabel = new JLabel("用户ID");
    private JTextField username = new JTextField();
    private JLabel passwordLabel = new JLabel("密   码");
    private JPasswordField password = new JPasswordField();
    private JButton okbtn = new JButton("确定");
    private JButton cancelbtn = new JButton("取消");
    private ButtonGroup identityGroup = new ButtonGroup();
    private JButton registerButton = new JButton("注册");
    private JLabel selectUserOrAdmin = new JLabel("身   份");

    private JRadioButton userRadioButton = new JRadioButton("用户");
    private JRadioButton adminRadioButton = new JRadioButton("管理员");

    public LoginView() {
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


        //将身份按钮加入分组
        identityGroup.add(userRadioButton);
        identityGroup.add(adminRadioButton);
        //设置默认选择用户
        userRadioButton.setSelected(true);

    }

    public void init() {

        /*标题部分--North*/
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("图书管理系统登录"));
        contentPane.add(titlePanel, "North");

        /*输入部分--Center*/
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        userLabel.setBounds(50, 20, 50, 20);
        passwordLabel.setBounds(50, 60, 50, 20);
        selectUserOrAdmin.setBounds(50,100,100,20);

        userRadioButton.setBounds(100,100,100,20);
        adminRadioButton.setBounds(160,100,100,20);
        fieldPanel.add(selectUserOrAdmin);

        fieldPanel.add(userLabel);
        fieldPanel.add(passwordLabel);

        fieldPanel.add(adminRadioButton);
        fieldPanel.add(userRadioButton);
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
        buttonPanel.add(registerButton);
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
                String uname = username.getText();
                String pwd = String.valueOf(password.getPassword());
                String identity = null;
                System.out.println("用户名--->"+uname);
                System.out.println("密码--->"+pwd);

                if(userRadioButton.isSelected()){
                    //用户登录逻辑
                    identity = "用户";
                    System.out.println("当前选择的身份--->"+userRadioButton.getText());
                }else {
                    //管理员登录逻辑
                    identity = "管理员";
                    System.out.println("当前选择的身份--->"+adminRadioButton.getText());
                }
//                跳转逻辑到新窗口

                try {
                    int login = UserService.login(uname, pwd);
                    if(login==1){
                        new UserView();
                    }else {
                        JOptionPane.showMessageDialog(null,"用户ID或密码错误请重试");
                        new LoginView();
                        disposeJframe();
                    }
                }catch (Exception e1){
                    System.out.println("登录异常请重试");
                    new LoginView();

                    disposeJframe();
                }
//                销毁当前窗口
                disposeJframe();

            }
        });
        //取消按下去清空
        cancelbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                password.setText("");
            }
        });
        //注册button  跳转到注册页面
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RegisterView();
                disposeJframe();
            }
        });
    }

}
