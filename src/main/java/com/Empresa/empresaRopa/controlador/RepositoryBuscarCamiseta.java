package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.CamisetaEntity;

import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarCamiseta  extends JpaRepository<CamisetaEntity,Long > {
    List<CamisetaEntity> findById(long id);

    List<FaldaEntity> findByTipo(String tipo);


}

