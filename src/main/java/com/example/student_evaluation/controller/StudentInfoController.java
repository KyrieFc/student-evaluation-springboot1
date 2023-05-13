package com.example.student_evaluation.controller;

import com.example.student_evaluation.common.CommonResult;
import com.example.student_evaluation.entity.StudentInfo;
import com.example.student_evaluation.entity.vo.StudentInfoQueryVO;
import com.example.student_evaluation.entity.vo.StudentInfoVO;
import com.example.student_evaluation.service.StudentInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Tag(name = "学生信息")
@RestController
@RequestMapping("/api/info/student")
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;

    @Operation(description = "查询学生信息")
    @GetMapping("/get")
    public CommonResult<StudentInfoVO> getStudentInfo(@Valid StudentInfoQueryVO queryVO) {

        StudentInfoVO infoVO = studentInfoService.getStudentInfo(queryVO.getStudentID());

        if (infoVO != null) {
            return CommonResult.success(infoVO);
        } else {
            return CommonResult.error(404, "未找到该学号的学生");
        }
    }

    @Operation(description = "发送学生信息")
    @PostMapping("/update")
    public CommonResult<StudentInfo> updateStudentInfo(@RequestBody @Valid StudentInfo studentInfo) {
        StudentInfo updatedInfo = studentInfoService.updateStudentInfo(studentInfo);

        if (updatedInfo != null) {
            return CommonResult.success(updatedInfo);
        } else {
            return CommonResult.error(500, "学生信息更新失败");
        }
    }

    @Operation(description = "审核学生信息")
    @PostMapping("/review")
    public CommonResult<StudentInfo> reviewStudentInfo(@RequestBody @Valid StudentInfo studentInfo) {
        // 调用服务层的审核方法
        StudentInfo reviewedInfo = studentInfoService.reviewStudentInfo(studentInfo);

        if (reviewedInfo != null) {
            return CommonResult.success(reviewedInfo);
        } else {
            return CommonResult.error(500, "学生信息审核未通过");
        }
    }
}

