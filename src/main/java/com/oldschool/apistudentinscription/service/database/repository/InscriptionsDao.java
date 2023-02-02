package com.oldschool.apistudentinscription.service.database.repository;

import com.oldschool.apistudentinscription.service.database.entity.Inscriptions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionsDao extends JpaRepository<Inscriptions,Long> {
}
