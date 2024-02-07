package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.models.CamisetaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositorCamiseta extends CrudRepository<CamisetaEntity,Long > {
    List<CamisetaEntity> findById(long id);




}

