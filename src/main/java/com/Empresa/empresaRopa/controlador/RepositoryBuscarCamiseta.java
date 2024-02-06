package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.CamisetaEntity;
import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarCamiseta  extends CrudRepository<CamisetaEntity,Long > {
    List<CamisetaEntity> findById(long id);




}

