package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Falda;
import com.Empresa.empresaRopa.models.Pantalon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarPantalon  extends JpaRepository<Pantalon, Long> {
    List<Pantalon> findByTipo(String tipo);


}