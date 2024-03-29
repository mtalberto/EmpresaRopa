package com.Empresa.empresaRopa.servicios;

import com.Empresa.empresaRopa.repository.RepositoryCompras;
import com.Empresa.empresaRopa.entitys.ComprasEntity;
import org.springframework.stereotype.Service;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioCompras {

    private final RepositoryCompras repositoryCompras;

    public ServicioCompras(RepositoryCompras repositoryCompras) {
        this.repositoryCompras = repositoryCompras;
    }

    @SuppressWarnings("null")
    public ComprasEntity guardarVentas(ComprasEntity ventas){
        return this.repositoryCompras.save(ventas);
    }
}
