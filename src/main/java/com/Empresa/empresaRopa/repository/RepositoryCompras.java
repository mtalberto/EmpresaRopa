package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.entitys.ComprasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryCompras extends CrudRepository<ComprasEntity,Long> {

    List<ComprasEntity> findByUsuarioId(Long usuarioId);
}
