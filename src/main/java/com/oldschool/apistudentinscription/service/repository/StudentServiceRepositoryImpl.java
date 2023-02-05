package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.daos.StudentsDao;
import com.oldschool.apistudentinscription.service.database.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentServiceRepositoryImpl implements StudentServiceRepository{
    @Autowired
    private StudentsDao studentsDao;
    @Override
    public StudentEntity findById(Long id) {
        return studentsDao.findById(id).orElseThrow();
    }

    @Override
    public StudentEntity findByNumberId(String numberId) {
        return studentsDao.findByNumberId(numberId).orElseThrow();
    }

    @Override
    public List<StudentEntity> findAll() {
        return studentsDao.findAll();
    }

    @Override
    public void saveStudent(StudentEntity studentEntity) {
        studentsDao.save(studentEntity);
    }
}
