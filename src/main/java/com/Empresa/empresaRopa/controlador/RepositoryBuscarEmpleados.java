package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.EmpleadoEntity;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryBuscarEmpleados extends JpaRepository<EmpleadoEntity, Long > {


    List<EmpleadoEntity> findById(long id);

}
