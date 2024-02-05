package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.AbrigoEntity;
import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarAbrigo  extends CrudRepository<AbrigoEntity,Long> {
    List<AbrigoEntity> findById(long id);

    List<FaldaEntity> findByTipo(String tipo);

}