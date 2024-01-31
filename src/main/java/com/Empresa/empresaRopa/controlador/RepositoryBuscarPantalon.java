package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.PantalonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryBuscarPantalon  extends JpaRepository<PantalonEntity,Long>{
    List<PantalonEntity> findById(long id);


}