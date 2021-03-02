package kuang.dao;




import kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    @Select("select * from mybatis.user where id=#{id2}")
    User getUserById(@Param("id2") int id);

    @Insert("insert into mybatis.user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update mybatis.user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from mybatis.user where id=#{id}")
    int deleteUser(User user);
}
