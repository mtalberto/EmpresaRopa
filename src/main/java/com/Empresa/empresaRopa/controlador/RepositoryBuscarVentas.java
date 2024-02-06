package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.VentasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarVentas  extends CrudRepository<VentasEntity,Long> {
    List<VentasEntity> findByPantalonId(long pantalon_id);
    List<VentasEntity> findByAbrigoId(long abrigo_id);
    List<VentasEntity> findByCamisetaId(long camiseta_id);
    List<VentasEntity> findByFaldaId(long falda_id);
    List<VentasEntity> findByRopaInteriorId(long roptainterior_id);

    List<VentasEntity> findByEmpleadoId(long empleado_id);
}
