package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.dto.UsuarioDTO;
import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryUsuarios extends CrudRepository<UsuarioEntity, Long > {
//puedo hacer consultas personalizadas mediante  @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
// @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")
@Query("SELECT new com.Empresa.empresaRopa.dto.UsuarioDTO(e.nombre, SUM(v.cantidad)) FROM VentasEntity v JOIN v.empleado e GROUP BY e.nombre")
List<UsuarioDTO> findVentasPorEmpleado();

}
