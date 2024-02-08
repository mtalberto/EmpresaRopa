package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.entitys.EmpleadoEntity;
import com.Empresa.empresaRopa.entitys.VentasEntity;
import com.Empresa.empresaRopa.repository.RepositoryEmpleados;
import com.Empresa.empresaRopa.repository.RepositoryVentas;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioEmpleados {

    /**
     * @Autowired hacen que tu código sea más limpio, más modular, y más fácil de testear.
     * No tienes que preocuparte por cómo se crean e inicializan tus dependencias
     * dependencia" en el contexto de la programación y, más específicamente, en el desarrollo de software,
     * se refiere a un
     * fragmento de código o una pieza de software que otro fragmento de código necesita para funcionar
     */


    //inyecta las dependecias de repository o lo que es lo mismo la instancia
    @Autowired
    private final RepositoryEmpleados repositoryEmpleados;
    private final RepositoryVentas repositoryVentas;

    public ServicioEmpleados(RepositoryEmpleados repositoryEmpleados, RepositoryVentas repositoryVentas) {
        this.repositoryEmpleados = repositoryEmpleados;
        this.repositoryVentas = repositoryVentas;
    }


    public EmpleadoEntity guardarEmpleados( EmpleadoEntity empleado){
       return  this.repositoryEmpleados.save(empleado);
    }
    public EmpleadoEntity obtenerVentasAsociadasEmpleado(Long idempl,Long ventaId){
        Optional<EmpleadoEntity> empleadoOpt = repositoryEmpleados.findById(idempl);
        Optional<VentasEntity> ventaOpt = repositoryVentas.findById(ventaId);

        if (!empleadoOpt.isPresent()) {
            throw new EntityNotFoundException("Empleado no encontrado con ID: " + idempl);
        }

        if (!ventaOpt.isPresent()) {
            throw new EntityNotFoundException("Venta no encontrada con ID: " + ventaId);
        }

        EmpleadoEntity empleado = empleadoOpt.get();
        VentasEntity venta = ventaOpt.get();

        List<VentasEntity> listaventas = empleado.getVentaEmpleado();
        if (listaventas == null) {
            listaventas = new ArrayList<>();
        }
        listaventas.add(venta);
        empleado.setVentaEmpleado(listaventas);

        return repositoryEmpleados.save(empleado);
    }
}
