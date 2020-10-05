package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.OccupationEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IOccupationRepository extends JpaRepository<OccupationEntity, Serializable> {

	OccupationEntity save(OccupationEntity entity) throws PersistenceException;

	OccupationEntity findByOccupation(String occupation) throws PersistenceException;

	Long deleteByOccupation(String occupation) throws PersistenceException;
}
