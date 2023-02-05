package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;
import com.oldschool.apistudentinscription.service.database.daos.InscriptionsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentInscriptionServiceRepositoryImpl implements StudentInscriptionServiceRepository {

    @Autowired
    private InscriptionsDao inscriptionsDao;

    @Override
    public List<InscriptionsEntity> findAll() {
        return inscriptionsDao.findAll();
    }

    @Override
    public InscriptionsEntity findById(Long id) {
        return inscriptionsDao.findById(id).orElseThrow();
    }

    @Override
    public InscriptionsEntity findInscriptionByStudentIdNumber(String studentIdNumber) {
        return inscriptionsDao.findByNumberId(studentIdNumber);
    }

    @Override
    public void saveInscription(InscriptionsEntity inscriptionsEntity) {
        inscriptionsDao.save(inscriptionsEntity);
    }
}
