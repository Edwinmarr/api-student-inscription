package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.entity.StudentEntity;

import java.util.List;

public interface StudentServiceRepository {

    StudentEntity findById(Long id);
    StudentEntity findByNumberId(String numberId);
    List<StudentEntity> findAll();
    void saveStudent(StudentEntity studentEntity);

}
