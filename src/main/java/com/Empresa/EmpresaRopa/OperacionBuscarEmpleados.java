package com.Empresa.EmpresaRopa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperacionBuscarEmpleados extends JpaRepository<Employe, Long> {

    List<Employe> findBySegundoApellido(String segundoApellido);


}
