package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.EmpleadoEntity;
import com.Empresa.empresaRopa.repository.RepositoryEmpleados;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/RecursosHumanos")
public class ControladorEmpleados {

    private final RepositoryEmpleados repositoryEmpleados;

    public ControladorEmpleados(RepositoryEmpleados repositoryEmpleados) {
        this.repositoryEmpleados = repositoryEmpleados;
    }


    @GetMapping("/empleados")
    public Iterable<EmpleadoEntity> findAllEmploye() {

        return this.repositoryEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public EmpleadoEntity addOneEmploye(@RequestBody EmpleadoEntity empleadoEntity){

        return this.repositoryEmpleados.save(empleadoEntity);
    }


}
