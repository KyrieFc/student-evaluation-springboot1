package com.example.student_evaluation.entity.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 用户信息
*
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfoQueryVO implements Serializable {

    /**
    * 学号
    */
    @NotNull(message="[学号]不能为空")
    @Schema(description ="学号",requiredMode = Schema.RequiredMode.REQUIRED,example = "2200000000")
    @Length(min = 3, max = 20, message = "[学号]长度不正确")
    @Pattern(regexp = "^[0-9]+$", message = "[学号]只能为数字")
    private String studentID;
    /**
    * 姓名
    */
    @NotNull(message="[姓名]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Schema(description ="姓名",requiredMode = Schema.RequiredMode.REQUIRED,example = "张三")
    private String name;



}
