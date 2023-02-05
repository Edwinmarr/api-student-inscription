package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.InscriptionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionsDao extends JpaRepository<InscriptionsEntity,Long> {
}
