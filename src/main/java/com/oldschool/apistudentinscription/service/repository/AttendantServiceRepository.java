package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.entity.AttendantsEntity;

import java.util.List;

public interface AttendantServiceRepository {
    void saveAttendantInformation(AttendantsEntity attendantsEntity);
    List<AttendantsEntity> findAll();
    AttendantsEntity findById(Long AttendantId);
    AttendantsEntity findByEmailAddress(String emailAddress);


}
