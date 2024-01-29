package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.Ropa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RepositoryBuscarRopa extends JpaRepository<Ropa, Long> {

    List<Ropa> findByRopa(String tipo);
}
