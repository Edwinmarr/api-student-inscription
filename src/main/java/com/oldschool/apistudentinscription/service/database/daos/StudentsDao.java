package com.oldschool.apistudentinscription.service.database.daos;

import com.oldschool.apistudentinscription.service.database.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentsDao extends JpaRepository<StudentEntity,Long> {
    Optional<StudentEntity> findByNumberId(String numberId);
}
