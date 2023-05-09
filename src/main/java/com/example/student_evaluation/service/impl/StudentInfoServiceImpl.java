package com.example.student_evaluation.service.impl;

import com.example.student_evaluation.entity.vo.StudentInfoVO;
import com.example.student_evaluation.mapper.StudentInfoMapper;
import com.example.student_evaluation.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Nvnqs
*/
@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    @Autowired
    private StudentInfoMapper studentInfoMapper;
    @Override
    public StudentInfoVO getStudentInfo(String studentId) {
        return studentInfoMapper.getStudentInfoByStudentId(studentId);
    }
}




