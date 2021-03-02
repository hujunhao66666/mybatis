package com.kuang.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Alias("student")
@Data
public class student {
    private int id;
    private String name;
    private com.kuang.pojo.teacher teacher;

}
