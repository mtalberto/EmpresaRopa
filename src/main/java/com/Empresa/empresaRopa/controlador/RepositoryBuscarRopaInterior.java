package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Falda;
import com.Empresa.empresaRopa.models.RopaInterior;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarRopaInterior  extends JpaRepository<RopaInterior, Long> {
    List<RopaInterior> findByTipo(String tipo);


}