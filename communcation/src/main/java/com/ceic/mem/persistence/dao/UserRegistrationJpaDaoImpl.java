package com.ceic.mem.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ceic.mem.persistence.entity.UserRegistrationEntity;
import com.ciec.mem.exception.MatrimonyException;

@Repository
@Transactional
public class UserRegistrationJpaDaoImpl implements IUserRegistrationJpaDao {
	private static final Logger LOG = LoggerFactory.getLogger(UserRegistrationJpaDaoImpl.class);
	
	@PersistenceContext
	private EntityManager entityMgr;

	public UserRegistrationEntity insert(UserRegistrationEntity entity) throws MatrimonyException {

		try {
			entityMgr.persist(entity);
			Query query = entityMgr.createQuery("SELECT x FROM UserRegistrationEntity x WHERE  x.userId = :id");
			query.setParameter("id", entity.getUserId());
			return (UserRegistrationEntity) query.getSingleResult();
		} catch (DataAccessException e) {
			LOG.debug("got problem during save");
			throw new MatrimonyException("data access problem");
		}
	}
}
