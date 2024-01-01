package com.example.restdemo.model;
import jakarta.persistence.*;


@Entity
@Table(name="student_info")
public class StudentMs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or other strategy based on your database setup
    private Long studentId;
    private String studentName;
    private String studentAddress;
    private String studentPhoneNumber;
    private String studentDob;

    public StudentMs() {
    }

    public StudentMs(Long studentId, String studentName, String studentAddress, String studentPhoneNumber,String studentDob) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentDob = studentDob;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;

    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }
}
