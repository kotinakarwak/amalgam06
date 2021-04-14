package com.kotinakarwak.amalgam06.converter;

import com.kotinakarwak.amalgam06.dto.BaseDTO;
import com.kotinakarwak.amalgam06.entities.DistributedEntity;

/**
 * Abstract converter from entity to dto.
 *
 * @param <ENTITY> Entity to convert.
 * @param <DTO> DTO in which we are converting.
 */
public abstract class AbstractDTOConverter<ENTITY extends DistributedEntity, DTO extends BaseDTO> {

    /**
     * Convert forwarded entity into DTO
     * @param entity Source entity
     * @return
     */
    public abstract DTO convert(final ENTITY entity);

    /**
     * Convert forwarded entity to forwarded dto (abstract)
     * @param entity Source entity to convert
     * @param dto Target
     */
    public void convert(final ENTITY entity, DTO dto){
        dto.setId(entity.getId());
        dto.setCreated(entity.getCreated());
        dto.setModified(entity.getModified());

    }
}
