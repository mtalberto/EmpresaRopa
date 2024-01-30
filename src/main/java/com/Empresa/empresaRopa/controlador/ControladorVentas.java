package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Ventas;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//Controlador REST
@RestController
public class ControladorVentas {
    private final RepositoryBuscarVentas repositoryBuscarVentas;

    public ControladorVentas(RepositoryBuscarVentas repositoryBuscarVentas) {
        this.repositoryBuscarVentas = repositoryBuscarVentas;
    }
//@RequestBody) se espera que sea un objeto Ventas, que se guarda en la base de datos.
    @PostMapping("/ventas")
    public Ventas addOneVenta(@RequestBody Ventas venta) {

        return this.repositoryBuscarVentas.save(venta);
    }

    @GetMapping("/ventas")
    public Iterable<Ventas> findAllVenyas() {

        return this.repositoryBuscarVentas.findAll();
    }

}