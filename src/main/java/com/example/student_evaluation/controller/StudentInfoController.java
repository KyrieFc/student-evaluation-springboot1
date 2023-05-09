package com.example.student_evaluation.controller;

import com.example.student_evaluation.common.CommonResult;
import com.example.student_evaluation.entity.vo.StudentInfoQueryVO;
import com.example.student_evaluation.entity.vo.StudentInfoVO;
import com.example.student_evaluation.service.StudentInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "学生信息")
@RestController
@RequestMapping("/api/info/student")
public class StudentInfoController {
    @Autowired
    private StudentInfoService studentInfoService;
    @Operation(description="查询学生信息")
    @GetMapping("/get")
    public CommonResult<StudentInfoVO> getStudentInfo(@RequestBody @Valid StudentInfoQueryVO queryVO) {

        StudentInfoVO infoVO = studentInfoService.getStudentInfo(queryVO.getStudentID());

        if(infoVO != null) {
            return CommonResult.success(infoVO);
        }
        else{
            return CommonResult.error(404,"未找到该学号的学生");
        }
    }
}
