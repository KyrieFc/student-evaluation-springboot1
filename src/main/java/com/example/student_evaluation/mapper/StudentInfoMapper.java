package com.example.student_evaluation.mapper;

import com.example.student_evaluation.entity.vo.StudentInfoVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentInfoMapper {
    public StudentInfoVO getStudentInfoByStudentId(String studentId);

}
