package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.EmployeeEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Serializable> {

	EmployeeEntity save(EmployeeEntity entity) throws PersistenceException;

	EmployeeEntity findByEmployee(String employee) throws PersistenceException;

	Long deleteByEmployee(String employee) throws PersistenceException;
}
