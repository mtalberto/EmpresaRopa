package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.entitys.EmpleadoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryEmpleados extends CrudRepository<EmpleadoEntity, Long > {
//puedo hacer consultas personalizadas mediante  @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
// @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
//    List<Modelo> buscarPorAtributo(@Param("atributo") String atributo);
    List<EmpleadoEntity> findById(long id);

}
