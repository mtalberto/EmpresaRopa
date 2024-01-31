package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.CamisetaEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarCamiseta  extends JpaRepository<CamisetaEntity, String> {
    List<CamisetaEntity> findByTipo(String tipo);


}

