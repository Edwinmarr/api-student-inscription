package com.oldschool.apistudentinscription.service.business;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;

import java.util.List;

public interface StudentInscriptionServiceBusiness {
    List<InscriptionsEntity> findAll();
    InscriptionsEntity findById(Long id);
    InscriptionsEntity findInscriptionByStudentIdNumber(String studentIdNumber);
    void saveInscription(InscriptionsEntity inscriptionsEntity);
}
