package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.FaldaEntity;
import com.Empresa.empresaRopa.models.RopaInteriorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarRopaInterior  extends JpaRepository<RopaInteriorEntity, Long> {
    List<RopaInteriorEntity> findById(long id);
    List<FaldaEntity> findByTipo(String tipo);

}