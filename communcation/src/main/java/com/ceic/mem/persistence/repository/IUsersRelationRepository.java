package com.ceic.mem.persistence.repository;

import java.io.Serializable;

import javax.persistence.PersistenceException;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.UsersRelationEntity;

@Repository
@Transactional("txManager")
@SuppressWarnings("unchecked")
public interface IUsersRelationRepository extends JpaRepository<UsersRelationEntity, Serializable> {

	UsersRelationEntity save(UsersRelationEntity entity) throws PersistenceException;

	UsersRelationEntity findByFromUserId(String fromUserId) throws PersistenceException;

	Long deleteByFromUserId(String fromUserId) throws PersistenceException;
}
