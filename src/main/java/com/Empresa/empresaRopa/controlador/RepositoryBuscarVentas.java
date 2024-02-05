package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.VentasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarVentas  extends CrudRepository<VentasEntity,Long> {
    List<VentasEntity> findByPantalonEntityId(long id);
    List<VentasEntity> findByAbrigoEntityId(long id);
    List<VentasEntity> findByCamisetaEntityId(long id);
    List<VentasEntity> findByFaldaEntityId(long id);
    List<VentasEntity> findByRopaInteriorEntityId(long id);

    List<VentasEntity> findByEmpleadoEntityId(long id_empleado);
}
