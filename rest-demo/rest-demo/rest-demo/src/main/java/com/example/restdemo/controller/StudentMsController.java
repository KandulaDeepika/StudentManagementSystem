package com.example.restdemo.controller;

import com.example.restdemo.model.StudentMs;
import com.example.restdemo.service.StudentMsService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentMsController {
    StudentMsService studentMsService;
    public StudentMsController(StudentMsService studentMsService) {
        this.studentMsService = studentMsService;
    }


    @GetMapping("/{studentId}")
    public StudentMs getStudentMsDetails(@PathVariable("studentId") String studentId){
        return studentMsService.getStudentMs(studentId);
    }
    @GetMapping()
    public List<StudentMs> getAllStudentMsDetails(){
        return studentMsService.getAllStudentMs();
    }
    @PostMapping()
    public String createStudentMsDetails(@RequestBody StudentMs studentMs){
        studentMsService.createStudentMs(studentMs);
        return "student data created successfully";
    }

    @PutMapping()
    public String updateStudentMsDetails(@RequestBody StudentMs studentMs){
        studentMsService.updateStudentMs(studentMs);
        return "student data updated successfully";
    }
    @DeleteMapping("/{studentId}")
    public String deleteStudentMsDetails(@PathVariable("studentId") String studentId){
        studentMsService.deleteStudentMs(studentId);
        return "student data deleted successfully";
    }
}
