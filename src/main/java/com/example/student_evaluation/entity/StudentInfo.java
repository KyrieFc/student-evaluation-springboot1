package com.example.student_evaluation.entity;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
* 用户信息表
*
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
    @Schema(description = "用户ID", example = "1")
    private String id;
    /**
    * 学号
    */
    @NotNull(message="[学号]不能为空")
    @Schema(description = "学号", example = "2200000001")
    private String studentID;
    /**
    * 姓名
    */
    @NotBlank(message="[姓名]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "姓名", example = "张三")
    private String name;
    /**
    * 专业名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "专业名称", example = "二学位")
    private String major;
    /**
    * 学苑名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "学苑名称", example = "求知一苑")
    private String class_name;
    /**
    * 入学年份
    */
    @Schema(description = "入学年份", example = "2022")
    private String admission_year;
    /**
    * 导师姓名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "导师姓名", example = "张齐勋")
    private String supervisor;
    /**
    * 性别
    */
    @NotNull(message="[性别]不能为空")
    @Schema(description = "性别", example = "0")
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
    @Schema(description = "版本", example = "0")
    private Integer version;


}
