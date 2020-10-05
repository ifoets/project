package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.FamilyDetailsEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IFamilyDetailsRepository extends JpaRepository<FamilyDetailsEntity, Serializable> {

	FamilyDetailsEntity save(FamilyDetailsEntity entity) throws PersistenceException;

	FamilyDetailsEntity findByUserId(String userId) throws PersistenceException;

	Long deleteByUserId(String userId) throws PersistenceException;
}
