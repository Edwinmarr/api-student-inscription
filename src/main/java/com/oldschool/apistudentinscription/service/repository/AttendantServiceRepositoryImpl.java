package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.entity.AttendantsEntity;
import com.oldschool.apistudentinscription.service.database.daos.AttendantsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class AttendantServiceRepositoryImpl implements AttendantServiceRepository {
    @Autowired
    private AttendantsDao attendantsDao;
    @Override
    public void saveAttendantInformation(AttendantsEntity attendantsEntity) {
        attendantsDao.save(attendantsEntity);
    }

    @Override
    public List<AttendantsEntity> findAll() {
        return attendantsDao.findAll();
    }

    @Override
    public AttendantsEntity findById(Long attendantId) {
        return attendantsDao.findById(attendantId).orElseThrow();
    }

    @Override
    public AttendantsEntity findByEmailAddress(String emailAddress) {
        return attendantsDao.findByEmailAddress(emailAddress).orElseThrow();
    }
}
