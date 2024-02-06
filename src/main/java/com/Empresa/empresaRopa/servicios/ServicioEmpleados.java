package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.controlador.RepositoryBuscarEmpleados;
import com.Empresa.empresaRopa.models.EmpleadoEntity;
import org.springframework.stereotype.Service;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioEmpleados {

    private final RepositoryBuscarEmpleados repositoryBuscarEmpleados;

    public ServicioEmpleados(RepositoryBuscarEmpleados repositoryBuscarEmpleados) {
        this.repositoryBuscarEmpleados = repositoryBuscarEmpleados;
    }


    public EmpleadoEntity guardarEmpleados( EmpleadoEntity empleado){
       return  this.repositoryBuscarEmpleados.save(empleado);
    }
}
