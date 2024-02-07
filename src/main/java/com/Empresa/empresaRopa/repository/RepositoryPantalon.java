package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.models.PantalonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryPantalon extends RepositoryRopa{
    List<PantalonEntity> findById(long id);




// los reporsitory se hacen de las clases entity jparepository
}