package com.kotinakarwak.amalgam06.service;

import com.kotinakarwak.amalgam06.api.AbstractCRUDApi;
import com.kotinakarwak.amalgam06.dto.BaseDTO;
import com.kotinakarwak.amalgam06.entities.DistributedEntity;
import com.kotinakarwak.amalgam06.repository.DistributedRepository;


public class AbstractCRUDService <ENTITY extends DistributedEntity, DTO extends BaseDTO>
        implements AbstractCRUDApi<ENTITY, DTO> {

    private DistributedRepository<ENTITY> repository;

    @Override
    public DTO save(DTO dto) {
        return null;
    }

    @Override
    public DTO getById(Long id) {
        return null;
    }
}
