package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Empleado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryBuscarEmpleados extends JpaRepository<Empleado, Long> {

    List<Empleado> findBySegundoApellido(String segundoApellido);
    List<Empleado> findByPrimerApellido(String primerApellido);

}
