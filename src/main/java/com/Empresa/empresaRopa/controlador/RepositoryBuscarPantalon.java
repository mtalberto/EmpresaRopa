package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.FaldaEntity;
import com.Empresa.empresaRopa.models.PantalonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarPantalon  extends JpaRepository<PantalonEntity,Long>{
    List<PantalonEntity> findById(long id);
    List<FaldaEntity> findByTipo(String tipo);
// los reporsitory se hacen de las clases entity jparepository
}