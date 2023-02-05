package com.oldschool.apistudentinscription.service.database.daos;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionsDao extends JpaRepository<InscriptionsEntity,Long> {
    InscriptionsEntity findByNumberId(String numberId);
}
