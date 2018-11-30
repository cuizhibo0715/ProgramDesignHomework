package xd.an.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import team.hs.libsys.dao.BookMapper;
import team.hs.libsys.pojo.Book;
import team.hs.libsys.util.MyDBUtils;
import team.hs.libsys.util.MybatisUtils;

import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class TestDb {
//    private static String driver = null;
//    private static String dbUrl = null;
//    private static String user = null;
//    private static String password = null;

    public static void main(String[] args)throws Exception {
//        System.out.println();
//        InputStream is = TestDb.class.getResourceAsStream("/db.properties");
//        Properties properties = new Properties();
//
//        properties.load(is);
//
//        driver = properties.getProperty("jdbc.driverClass");
//        dbUrl = properties.getProperty("url");
//        user = properties.getProperty("username");
//        password = properties.getProperty("password");
//
//        System.out.println(driver);
        Connection connection = MyDBUtils.getConnection();
        System.out.println(connection);
    }

//    @Test
//    public void testSelectOneById(){
//        SqlSession sqlSession = MybatisUtils.getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
//        criteria.andIdEqualTo(1);
//        List<User> users = userMapper.selectByExample(userExample);
//        System.out.println(users);
//    }

    @Test
    public void testInsertBook(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        try {
            Book book = new Book();
            book.setBookAuthor("anbingxu");
            book.setBookName("我的天啊");
            book.setBookNumbers(5);
            book.setBookPrice(new BigDecimal(100));
            book.setCategoryId("计算机");
            book.setBookBuyTime(new Date());
            bookMapper.insert(book);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}
