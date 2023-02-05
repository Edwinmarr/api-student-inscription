package com.oldschool.apistudentinscription.service.database.daos;

import com.oldschool.apistudentinscription.service.database.entity.AttendantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttendantsDao extends JpaRepository<AttendantsEntity,Long> {
    Optional<AttendantsEntity> findByEmailAddress(String emailAddress);
}
