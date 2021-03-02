package com.kuang.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("Teacher")
public class teacher {
    private int id;
    private String name;
}
