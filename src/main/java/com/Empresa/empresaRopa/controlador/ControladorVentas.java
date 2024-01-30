package com.Empresa.empresaRopa.controlador;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorVentas {
    private final RepositoryBuscarVentas repositoryBuscarVentas;

    public ControladorVentas(RepositoryBuscarVentas repositoryBuscarVentas) {
        this.repositoryBuscarVentas = repositoryBuscarVentas;
    }


}