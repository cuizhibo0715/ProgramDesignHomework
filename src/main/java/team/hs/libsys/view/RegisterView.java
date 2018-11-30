package team.hs.libsys.view;

import team.hs.libsys.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.UUID;

public class RegisterView {
    private JFrame jFrame = new JFrame("注册");
    private Container contentPane = jFrame.getContentPane();
    private JLabel userLabel = new JLabel("姓名");
    private JTextField username = new JTextField();
    private JLabel addressLabel = new JLabel("地址");
    private JTextField address = new JTextField();
    private JLabel userIdLabel = new JLabel("ID：");
    private JTextPane userId = new JTextPane();

    private JTextField unit = new JTextField();
    private JLabel unitLabel = new JLabel("单位");

    private JPasswordField password = new JPasswordField();
    private JLabel passwordLabel = new JLabel("密码");

    private JButton registerButton = new JButton("注册");
    private JButton cancleButton = new JButton("取消");


    public RegisterView() {
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

        //绑定事件
        addlisternerOnRegisterView();
    }

    public void init() {

        //标题
        JPanel titlePanel = new JPanel();
        titlePanel.add(new JLabel("    "));
        titlePanel.setLayout(new FlowLayout());

        //文本框部分
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        userIdLabel.setBounds(50, 10, 50, 20);
        userLabel.setBounds(50, 40, 50, 20);
        addressLabel.setBounds(50, 70, 50, 20);
        unitLabel.setBounds(50, 100, 50, 20);
        passwordLabel.setBounds(50, 130, 50, 20);
        fieldPanel.add(userIdLabel);
        fieldPanel.add(userLabel);
        fieldPanel.add(addressLabel);
        fieldPanel.add(unitLabel);
        fieldPanel.add(passwordLabel);
        userId.setBounds(110, 10, 120, 20);
        username.setBounds(110, 40, 120, 20);
        address.setBounds(110, 70, 120, 20);
        unit.setBounds(110, 100, 120, 20);
        password.setBounds(110, 130, 120, 20);
        //将textPane设置为不可编辑
        userId.setEditable(false);
        //显示唯一读者号
        showUserId();
        fieldPanel.add(userId);
        fieldPanel.add(username);
        fieldPanel.add(address);
        fieldPanel.add(unit);
        fieldPanel.add(password);
        contentPane.add(fieldPanel, "Center");


        //按钮部分
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(cancleButton);
        buttonPanel.add(registerButton);
        contentPane.add(buttonPanel, "South");


    }

    public String geneatorUserId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public void showUserId() {
        String userIdText = geneatorUserId();
        userId.setText(userIdText.substring(0, 6));
    }

    public void addlisternerOnRegisterView() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userIdText = userId.getText().trim();
                String usernameText = username.getText().trim();
                String addressText = address.getText().trim();
                String unitText = unit.getText().trim();
                char[] password = RegisterView.this.password.getPassword();
                String passwordText = new String(password).trim();
                System.out.println(userIdText + "\t" + usernameText + "\t" + addressText + "\t" + unitText + "\t" + passwordText);

                try {
                    //将用户写入数据库
                    UserService.createOneUser(userIdText, usernameText, addressText, unitText, passwordText);


                } catch (Exception e1) {
                    System.out.println("发生错误");
                }

                System.out.println("写入数据库成功！");
                jFrame.dispose();
                JOptionPane.showMessageDialog(null, "注册成功，请登录");
                new LoginView();

            }
        });
    }
}