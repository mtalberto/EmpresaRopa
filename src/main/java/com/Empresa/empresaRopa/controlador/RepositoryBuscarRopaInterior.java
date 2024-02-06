package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.FaldaEntity;
import com.Empresa.empresaRopa.models.RopaInteriorEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarRopaInterior  extends CrudRepository<RopaInteriorEntity, Long> {
    List<RopaInteriorEntity> findById(long id);
    List<FaldaEntity> findByTipo(String tiporopa);

}