package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.AbrigoEntity;

import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarAbrigo  extends JpaRepository<AbrigoEntity,Long> {
    List<AbrigoEntity> findById(long id);

    List<FaldaEntity> findByTipo(String tipo);

}