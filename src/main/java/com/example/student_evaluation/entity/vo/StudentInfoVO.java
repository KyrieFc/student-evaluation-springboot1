package com.example.student_evaluation.entity.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* 用户信息
* @TableName student_info
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentInfoVO implements Serializable {

    /**
    * 学号
    */
    @NotNull(message="[学号]不能为空")
    @Schema(description = "学号",requiredMode = Schema.RequiredMode.REQUIRED,example = "2200000000")
    private String studentID;
    /**
    * 姓名
    */
    @NotBlank(message="[姓名]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "姓名",requiredMode = Schema.RequiredMode.REQUIRED,example = "张三")
    private String name;
    /**
    * 专业名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description ="专业名称",example = "软件工程")
    private String major;
    /**
    * 学苑名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description = "学苑名称",example = "求知三苑")
    private String class_name;
    /**
    * 入学年份
    */
    @Schema(description ="入学年份",requiredMode = Schema.RequiredMode.REQUIRED,example = "2022")
    private String admission_year;
    /**
    * 导师姓名
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description ="导师姓名",example = "李四")
    private String supervisor;
    /**
    * 
    */
    @NotNull(message="[性别]不能为空")
    @Schema(description ="性别",allowableValues = "0,1")
    private Integer gender;

    @NotNull(message="[版本]不能为空")
    @Schema(description ="版本")
    private Integer version;


}
