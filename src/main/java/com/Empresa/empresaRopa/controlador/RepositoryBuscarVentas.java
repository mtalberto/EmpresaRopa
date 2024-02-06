package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.VentasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarVentas  extends CrudRepository<VentasEntity,Long> {
    List<VentasEntity> findByPantalonEntityId(long pantalon_id);
    List<VentasEntity> findByAbrigoEntityId(long abrigo_id);
    List<VentasEntity> findByCamisetaEntityId(long camiseta_id);
    List<VentasEntity> findByFaldaEntityId(long falda_id);
    List<VentasEntity> findByRopaInteriorEntityId(long pantalon_id);

    List<VentasEntity> findByEmpleadoEntityId(long empleado_id);
}
