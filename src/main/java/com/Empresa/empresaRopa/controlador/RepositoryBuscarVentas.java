package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.VentasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarVentas  extends JpaRepository<VentasEntity,String> {
    List<VentasEntity> findByPantalonEntityNombre(String nombre);
    List<VentasEntity> findByAbrigoEntityNombre(String nombre);
    List<VentasEntity> findByCamisetaEntityNombre(String nombre);
    List<VentasEntity> findByFaldaEntityNombre(String nombre);
    List<VentasEntity> findByRopaInteriorEntityNombre(String nombre);

    List<VentasEntity> findByEmpleadoEntityNombre(String nombre);
}
