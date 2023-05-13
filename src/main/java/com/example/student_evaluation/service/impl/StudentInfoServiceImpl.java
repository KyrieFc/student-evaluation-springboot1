package com.example.student_evaluation.service.impl;

import com.example.student_evaluation.entity.StudentInfo;
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

    @Override
    public StudentInfo updateStudentInfo(StudentInfo studentInfo) {
        int rowsAffected = studentInfoMapper.updateStudentInfo(studentInfo);
        if (rowsAffected > 0) {
            return studentInfo; // Return the updated StudentInfo
        } else {
            return null; // Return null to indicate that the update failed
        }
    }

    @Override
    public StudentInfo reviewStudentInfo(StudentInfo info) {
        String name = info.getName();

        // 判断姓名长度是否大于2
        if (name.length() > 2) {
            // 审核通过，可以进行其他操作
            // ...
            return info; // 返回审核通过的学生信息
        } else {
            // 审核不通过，可以进行其他操作
            // ...
            return null; // 返回null表示审核未通过
        }
    }

}




