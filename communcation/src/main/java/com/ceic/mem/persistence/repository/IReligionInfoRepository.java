package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.ReligionInfoEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IReligionInfoRepository extends JpaRepository<ReligionInfoEntity, Serializable> {

	ReligionInfoEntity save(ReligionInfoEntity entity) throws PersistenceException;

	ReligionInfoEntity findByUserId(String userId) throws PersistenceException;

	Long deleteByUserId(String userId) throws PersistenceException;
}
