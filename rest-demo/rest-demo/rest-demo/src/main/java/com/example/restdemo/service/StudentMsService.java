package com.example.restdemo.service;

import com.example.restdemo.model.StudentMs;
import java.util.List;
public interface StudentMsService {
    public String createStudentMs(StudentMs studentMs);
    public String updateStudentMs(StudentMs studentMs);
    public String deleteStudentMs(String studentId);
    public StudentMs getStudentMs(String studentId);
    public List<StudentMs> getAllStudentMs();
}
