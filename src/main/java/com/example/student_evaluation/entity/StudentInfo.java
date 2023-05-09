package com.example.student_evaluation.entity;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
* 用户信息表
* @TableName student_info
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentInfo implements Serializable {

    /**
    * 用户ID
    */
    @NotNull(message="[用户ID]不能为空")
    private String id;
    /**
    * 学号
    */
    @NotNull(message="[学号]不能为空")
    private String studentID;
    /**
    * 姓名
    */
    @NotBlank(message="[姓名]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 专业名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    private String major;
    /**
    * 学苑名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    private String class_name;
    /**
    * 入学年份
    */
    private String admission_year;
    /**
    * 导师姓名
    */
    @Size(max= 50,message="编码长度不能超过50")
    private String supervisor;
    /**
    * 性别
    */
    @NotNull(message="[性别]不能为空")
    private Integer gender;
    /**
    * 创建时间
    */
    private Date created_at;
    /**
    * 更新时间
    */
    private Date updated_at;
    /**
    * 版本
    */
    @NotNull(message="[版本]不能为空")
    private Integer version;


}
