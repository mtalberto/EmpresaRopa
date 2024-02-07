package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.repository.RepositoryEmpleados;
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

    private final RepositoryEmpleados repositoryEmpleados;

    public ServicioEmpleados(RepositoryEmpleados repositoryEmpleados) {
        this.repositoryEmpleados = repositoryEmpleados;
    }


    public EmpleadoEntity guardarEmpleados( EmpleadoEntity empleado){
       return  this.repositoryEmpleados.save(empleado);
    }
}
