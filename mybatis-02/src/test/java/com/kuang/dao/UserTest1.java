package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest1 {
    @Test
    public void test(){


        SqlSession sqlSession = MybatisUtils.getSqlSession();
        /*方式一*//*新方法*/
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userList = userMapper.getUserById(2);

        /*方式二*//*老方法*/
        /*List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserList");*/
        System.out.println(userList);



        sqlSession.close();
    }

}
