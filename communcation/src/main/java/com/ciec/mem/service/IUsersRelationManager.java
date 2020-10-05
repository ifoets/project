package com.ciec.mem.service;

import com.ciec.mem.dto.UsersRelationDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IUsersRelationManager {

	UsersRelationDTO persistOrMerge(UsersRelationDTO userRelation) throws MatrimonyException;

	UsersRelationDTO findByUserId(String userId) throws MatrimonyException;

	Long deleteByUserId(String userId) throws MatrimonyException;
}
