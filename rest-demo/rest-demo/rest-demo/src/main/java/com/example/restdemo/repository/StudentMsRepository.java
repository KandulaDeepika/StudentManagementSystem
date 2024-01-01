package com.example.restdemo.repository;

import com.example.restdemo.model.StudentMs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMsRepository extends JpaRepository<StudentMs,String> {


}
