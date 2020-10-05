package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.CountryEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface ICountryRepository extends JpaRepository<CountryEntity, Serializable> {

	CountryEntity save(CountryEntity entity) throws PersistenceException;

	CountryEntity findByCountryCode(Integer countryCode) throws PersistenceException;

	Long deleteByCountryCode(Integer countryCode) throws PersistenceException;
}
