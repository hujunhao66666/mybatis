package com.kuang.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data

public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
