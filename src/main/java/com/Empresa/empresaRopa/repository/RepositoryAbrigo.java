package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.models.AbrigoEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryAbrigo extends CrudRepository<AbrigoEntity,Long> {
    List<AbrigoEntity> findById(long id);


}