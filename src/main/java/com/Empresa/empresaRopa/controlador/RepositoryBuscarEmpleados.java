package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.EmpleadoEntity;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryBuscarEmpleados extends JCrudRepository<EmpleadoEntity, Long > {
//puedo hacer consultas personalizadas mediante  @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
// @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
//    List<Modelo> buscarPorAtributo(@Param("atributo") String atributo);
    List<EmpleadoEntity> findById(long id);

}
