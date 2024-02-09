package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuarios extends CrudRepository<UsuarioEntity, Long > {
//puedo hacer consultas personalizadas mediante  @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
// @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")



}
