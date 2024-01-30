package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryBuscarFalda extends JpaRepository<Falda, String>{
    List<Falda> findByTipo(String tipo);


}
