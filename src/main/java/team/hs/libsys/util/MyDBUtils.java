package team.hs.libsys.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class MyDBUtils {

    private static String driver = null;
    private static String dbUrl = null;
    private static String user = null;
    private static String password = null;

    static {

        try {
            // 通过类加载器获取资源
            InputStream is = MyDBUtils.class.getClassLoader().getResourceAsStream("db.properties");
            // 使用properties 处理流
            Properties properties = new Properties();

            properties.load(is);

            driver = properties.getProperty("jdbc.driverClass");
            dbUrl = properties.getProperty("jdbc.url");
            user = properties.getProperty("jdbc.user");
            password = properties.getProperty("jdbc.pass");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {

        Connection connection = null;

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("获取驱动并且获取链接成功");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return connection;
    }

    public static void release(Connection connection, PreparedStatement preparedStatement, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}