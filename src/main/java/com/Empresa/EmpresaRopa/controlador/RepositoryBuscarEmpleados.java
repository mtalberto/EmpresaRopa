package com.Empresa.EmpresaRopa.controlador;

import com.Empresa.EmpresaRopa.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryBuscarEmpleados extends JpaRepository<Employe, Long> {

    List<Employe> findBySegundoApellido(String segundoApellido);


}
