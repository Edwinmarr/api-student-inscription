package com.oldschool.apistudentinscription.service.repository;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;

import java.util.List;

public interface StudentInscriptionServiceRepository {
    List<InscriptionsEntity> findAll();
    InscriptionsEntity findById(Long id);
    InscriptionsEntity findInscriptionByStudentIdNumber(String studentIdNumber);
    void saveInscription(InscriptionsEntity inscriptionsEntity);
}
