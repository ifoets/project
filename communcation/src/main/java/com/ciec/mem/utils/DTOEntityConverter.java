package com.ciec.mem.utils;

import com.ceic.mem.model.converter.DtoToEntity;
import com.ceic.mem.model.converter.EntityToDto;

public class DTOEntityConverter {

	private EntityToDto EntityToDto;
	private DtoToEntity DtoToEntity;

	public DTOEntityConverter(EntityToDto entityToDto, DtoToEntity dtoToEntity) {
		super();
		EntityToDto = entityToDto;
		DtoToEntity = dtoToEntity;
	}

	private static DTOEntityConverter dTOEntityConverter = null;

	public static DTOEntityConverter getDTOEntityConverter() {
		if (dTOEntityConverter == null)
			dTOEntityConverter = new DTOEntityConverter(new EntityToDto(), new DtoToEntity());
		return dTOEntityConverter;
	}

	public EntityToDto getEntityToDto() {
		return EntityToDto;
	}

	public void setEntityToDto(EntityToDto entityToDto) {
		EntityToDto = entityToDto;
	}

	public DtoToEntity getDtoToEntity() {
		return DtoToEntity;
	}

	public void setDtoToEntity(DtoToEntity dtoToEntity) {
		DtoToEntity = dtoToEntity;
	}
}
