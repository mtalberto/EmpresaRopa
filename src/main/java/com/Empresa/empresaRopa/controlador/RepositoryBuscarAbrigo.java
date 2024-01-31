package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.AbrigoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarAbrigo  extends JpaRepository<AbrigoEntity,Long> {
    List<AbrigoEntity> findById(long id);


}