package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.FaldaEntity;
import com.Empresa.empresaRopa.models.PantalonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryBuscarPantalon  extends CrudRepository<PantalonEntity,Long>{
    List<PantalonEntity> findById(long id);




// los reporsitory se hacen de las clases entity jparepository
}