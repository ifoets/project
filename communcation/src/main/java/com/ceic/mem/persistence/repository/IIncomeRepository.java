package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.IncomeEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IIncomeRepository extends JpaRepository<IncomeEntity, Serializable> {

	IncomeEntity save(IncomeEntity entity) throws PersistenceException;

	IncomeEntity findByYearly(String yearly) throws PersistenceException;

	Long deleteByYearly(String yearly) throws PersistenceException;
}
