package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询全部用户
    List<User> getUserList();
    //根据模糊名字查询用户
    List<User> getUserByName(String name);
    //根据ID查询用户
    User getUserById(int id);
    User getUserById2(Map<String,Object> map);
    //插入一个用户
    int insertUser(User user);
    int addUser(Map<String,Object> map);
    //修改数据
    int updateUser(User user);
    //删除数据
    int deleteUser(int id);
}
