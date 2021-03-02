package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


public class UserTest {
    /*@Test
    public void test(){


        SqlSession sqlSession = MybatisUtils.getSqlSession();
        logger.info("进入sqlsession成功");
        *//*方式一*//**//*新方法*//*
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User userList = userMapper.getUserById(2);

        *//*方式二*//**//*老方法*//*
        *//*List<User> userList = sqlSession.selectList("com.kuang.dao.UserMapper.getUserList");*//*
        System.out.println(userList);



        sqlSession.close();
    }*/

    //static Logger logger= Logger.getLogger(UserTest.class);

    /*@Test
    public void testLog4j() {
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }*/

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userList = mapper.getUserByLimit(map);
        for (User user : userList) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
