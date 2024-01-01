package com.example.restdemo.service.impl;

import com.example.restdemo.model.StudentMs;
import com.example.restdemo.repository.StudentMsRepository;
import com.example.restdemo.service.StudentMsService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentMsServiceImpl implements StudentMsService {

    StudentMsRepository studentMsRepository;
    public StudentMsServiceImpl(StudentMsRepository studentMsRepository) {
        this.studentMsRepository = studentMsRepository;
    }

    @Override
    public String createStudentMs(StudentMs studentMs) {
        studentMsRepository.save(studentMs);
        return "Success";
    }

    @Override
    public String updateStudentMs(StudentMs studentMs) {
        studentMsRepository.save(studentMs);
        return "Success";
    }

    @Override
    public String deleteStudentMs(String studentId) {
        studentMsRepository.deleteById(studentId);
        return "Success";
    }

    @Override
    public StudentMs getStudentMs(String studentId) {
        return studentMsRepository.findById(studentId).get();
    }

    @Override
    public List<StudentMs> getAllStudentMs() {
        return studentMsRepository.findAll();
    }
}
