package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarVentas  extends JpaRepository<Ventas,String> {
    List<Ventas> findbByPrenda(String prenda);

}
