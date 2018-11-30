package team.hs.libsys.service;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import team.hs.libsys.dao.UserMapper;
import team.hs.libsys.pojo.User;
import team.hs.libsys.pojo.UserExample;
import team.hs.libsys.util.MybatisUtils;

public class UserService {


    public static void createOneUser(String uid, String uname,String address, String unit,String password) {
        /**
         *
         * 功能描述:
         *
         * @param: [uid, uname, uunit]
         * @return: void
         * @auther: bxan
         * @date: 2018/11/24 上午9:36
         *
         *
         */
        SqlSession sqlsession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        try {
            User user = new User();
            user.setUserId(uid);
            user.setUserName(uname);
            user.setUserUnit(unit);
            user.setUserPassword(password);
            user.setUserAddress(address);
            user.setUserSurplus(5);


            userMapper.insert(user);

            System.out.println("success");
            sqlsession.commit();
        }catch (Exception e){

            System.out.println(e);

        }finally {

            sqlsession.close();

        }

    }
    @Test
    public static void testinsert() {
        createOneUser("xxx23","yyyyynnn","西安","西电","987654321");
        System.out.println("success!!!!!!");
    }



    public static int login(String userid,String password){
        SqlSession sqlsession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userid);
        criteria.andUserPasswordEqualTo(password);
        if (userMapper.countByExample(userExample)!=0){
            System.out.println("UserService-->login");
            return 1;
        }

        return 0;


    }


}
