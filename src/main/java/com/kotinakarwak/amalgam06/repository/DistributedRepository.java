package com.kotinakarwak.amalgam06.repository;

import org.springframework.data.repository.CrudRepository;

public interface DistributedRepository<ENTITY extends DistributedRepository> extends CrudRepository<Long, ENTITY> {
}
