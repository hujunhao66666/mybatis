package com.kuang.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
public class Student {
    private int id;
    private String name;
    private int tid;

}
