package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryBuscarFalda extends CrudRepository<FaldaEntity, Long> {
    List<FaldaEntity> findById(long id);
    List<FaldaEntity> findByTipo(String tiporopa);

}
