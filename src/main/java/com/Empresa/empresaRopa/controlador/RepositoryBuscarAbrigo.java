package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Abrigo;
import com.Empresa.empresaRopa.models.Falda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarAbrigo  extends JpaRepository<Abrigo, String> {
    List<Abrigo> findByTipo(String tipo);


}