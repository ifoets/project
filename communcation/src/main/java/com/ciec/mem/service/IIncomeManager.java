package com.ciec.mem.service;

import com.ciec.mem.dto.IncomeDTO;
import com.ciec.mem.exception.MatrimonyException;

public interface IIncomeManager {

	IncomeDTO persistOrMerge(IncomeDTO income) throws MatrimonyException;

	IncomeDTO findByYearly(String yearly) throws MatrimonyException;

	Long deleteByYearly(String yearly) throws MatrimonyException;
}
