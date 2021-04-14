package com.kotinakarwak.amalgam06.api;

import com.kotinakarwak.amalgam06.dto.BaseDTO;
import com.kotinakarwak.amalgam06.entities.DistributedEntity;

/**
 * Abstract crudl api containing base methods for handling of crudl operations
 * @param <ENTITY> Entity class
 * @param <DTO> DTO class
 */
public interface AbstractCRUDApi<ENTITY extends DistributedEntity, DTO extends BaseDTO> {

    DTO save(DTO dto);

    DTO getById(Long id);

}
