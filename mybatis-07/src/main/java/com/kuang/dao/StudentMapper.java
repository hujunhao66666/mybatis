package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from teacher")
    List<Teacher> getTeacherList();


    Teacher getTeacher(@Param("id") int id);

    Teacher getTeacher2(@Param("id") int id);
}
