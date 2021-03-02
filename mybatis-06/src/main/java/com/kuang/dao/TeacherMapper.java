package com.kuang.dao;

import com.kuang.pojo.teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {

    @Select("select * from mybatis.teacher where id=#{tid}")
    teacher getTeacher(@Param("tid") int id);


}
