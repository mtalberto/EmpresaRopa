package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.entitys.PantalonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
// los reporsitory se hacen de las clases entity jparepository
public interface RepositoryPantalon extends JpaRepository<PantalonEntity, Long > {






}