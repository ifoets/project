package com.ceic.mem.persistence.dao;

import com.ceic.mem.persistence.entity.UserRegistrationEntity;
import com.ciec.mem.exception.MatrimonyException;

public interface IUserRegistrationJpaDao {
	UserRegistrationEntity insert(UserRegistrationEntity entity) throws MatrimonyException;
}
