package com.example.student_evaluation.service;

import com.example.student_evaluation.entity.vo.StudentInfoVO;

/**
* @author Nvnqs
*/
public interface StudentInfoService {
    StudentInfoVO getStudentInfo(String studentId);
}
