package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.AttendantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendantsDao extends JpaRepository<AttendantsEntity,Long> {
}
