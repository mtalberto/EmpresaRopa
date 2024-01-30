package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Camiseta;
import com.Empresa.empresaRopa.models.Falda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarCamiseta  extends JpaRepository<Camiseta, Long> {
    List<Camiseta> findByTipo(String tipo);


}

