package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsDao extends JpaRepository<StudentEntity,Long> {
}
