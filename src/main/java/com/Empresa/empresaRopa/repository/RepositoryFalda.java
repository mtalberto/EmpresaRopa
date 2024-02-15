package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.entitys.FaldaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryFalda extends JpaRepository<FaldaEntity, Long > {



}
