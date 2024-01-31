package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.EmpleadoEntity;
import com.Empresa.empresaRopa.models.VentasEntity;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

//Controlador REST
@RestController
public class ControladorVentas {
    private final RepositoryBuscarVentas repositoryBuscarVentas;
    private final RepositoryBuscarEmpleados repositoryBuscarEmpleados;

    public ControladorVentas(RepositoryBuscarVentas repositoryBuscarVentas, RepositoryBuscarEmpleados repositoryBuscarEmpleados) {
        this.repositoryBuscarVentas = repositoryBuscarVentas;
        this.repositoryBuscarEmpleados = repositoryBuscarEmpleados;
    }
//@RequestBody) se espera que sea un objeto Ventas, que se guarda en la base de datos.
    //debees recibir el id del empleado como parametro de la consulta
    @PostMapping("/ventas")
    public VentasEntity addOneVenta(@RequestBody VentasEntity venta,@RequestParam Long id_empleado) {
        EmpleadoEntity empleado=repositoryBuscarEmpleados.findById(id_empleado)
                        .orElseThrow(() -> new EntityNotFoundException("Empleado no encontrado"));

            venta.setEmpleadoEntity(empleado);
        return this.repositoryBuscarVentas.save(venta);
    }

    @GetMapping("/ventas")
    public Iterable<VentasEntity> findAllVenyas() {

        return this.repositoryBuscarVentas.findAll();
    }

}