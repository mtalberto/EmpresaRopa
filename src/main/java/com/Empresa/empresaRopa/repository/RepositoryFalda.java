package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.entitys.CamisetaEntity;
import com.Empresa.empresaRopa.entitys.FaldaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.jsf.FacesContextUtils;

@Repository
public interface RepositoryFalda extends CrudRepository<FaldaEntity, Long > {



}
