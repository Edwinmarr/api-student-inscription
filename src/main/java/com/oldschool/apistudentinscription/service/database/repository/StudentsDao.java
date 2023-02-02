package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsDao extends JpaRepository<Students,Long> {
}
