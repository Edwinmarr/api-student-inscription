package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.Attendants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendantsDao extends JpaRepository<Attendants,Long> {
}
