package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.models.RopaInteriorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryRopaInterior extends CrudRepository<RopaInteriorEntity, Long> {
    List<RopaInteriorEntity> findById(long id);


}