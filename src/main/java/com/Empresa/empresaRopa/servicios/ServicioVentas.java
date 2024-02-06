package com.Empresa.empresaRopa.servicios;

import com.Empresa.empresaRopa.controlador.RepositoryBuscarVentas;
import com.Empresa.empresaRopa.models.VentasEntity;
import org.springframework.stereotype.Service;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioVentas {

    private final RepositoryBuscarVentas repositoryBuscarVentas;

    public ServicioVentas(RepositoryBuscarVentas repositoryBuscarVentas) {
        this.repositoryBuscarVentas = repositoryBuscarVentas;
    }

    public VentasEntity guardarVentas(VentasEntity ventas){
        return this.repositoryBuscarVentas.save(ventas);
    }
}