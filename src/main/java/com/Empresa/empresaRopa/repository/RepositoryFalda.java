package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.models.FaldaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryFalda extends RepositoryRopa {
    List<FaldaEntity> findById(long id);


}
