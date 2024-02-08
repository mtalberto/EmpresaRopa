package com.Empresa.empresaRopa.repository;


import com.Empresa.empresaRopa.entitys.VentasEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryVentas extends CrudRepository<VentasEntity,Long> {

}
