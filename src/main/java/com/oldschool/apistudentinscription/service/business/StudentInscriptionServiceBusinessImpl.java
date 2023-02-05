package com.oldschool.apistudentinscription.service.business;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;
import com.oldschool.apistudentinscription.service.database.entity.StudentEntity;
import com.oldschool.apistudentinscription.service.database.repository.AttendantsDao;
import com.oldschool.apistudentinscription.service.database.repository.InscriptionsDao;
import com.oldschool.apistudentinscription.service.database.repository.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentInscriptionServiceBusinessImpl implements StudentInscriptionServiceBusiness{

    @Autowired
    private InscriptionsDao inscriptionsDao;
    @Autowired
    private StudentsDao studentsDao;
    @Autowired
    private AttendantsDao attendantsDao;

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
        return null;
    }

    @Override
    public void saveInscription(InscriptionsEntity inscriptionsEntity) {
        inscriptionsDao.save(inscriptionsEntity);
    }
}
