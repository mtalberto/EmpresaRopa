package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.EmpleadoEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class ControladorEmpleados {

    private final RepositoryBuscarEmpleados repositoryBuscarEmpleados;

    public ControladorEmpleados(RepositoryBuscarEmpleados repositoryBuscarEmpleados) {
        this.repositoryBuscarEmpleados = repositoryBuscarEmpleados;
    }


    @GetMapping("/empleados")
    public Iterable<EmpleadoEntity> findAllEmploye() {

        return this.repositoryBuscarEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public EmpleadoEntity addOneEmploye(@RequestBody EmpleadoEntity empleadoEntity){

        return this.repositoryBuscarEmpleados.save(empleadoEntity);
    }


}
