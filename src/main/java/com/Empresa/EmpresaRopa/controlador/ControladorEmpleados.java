package com.Empresa.EmpresaRopa.controlador;

import com.Empresa.EmpresaRopa.models.Employe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControladorEmpleados {

    private final RepositoryBuscarEmpleados repositoryBuscarEmpleados;

    public ControladorEmpleados(RepositoryBuscarEmpleados operacionBuscar) {
        this.repositoryBuscarEmpleados = operacionBuscar;

    }


    @GetMapping("/empleados")
    public Iterable<Employe> findAllEmploye() {

        return this.repositoryBuscarEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public Employe addOneEmploye(@RequestBody Employe employee) {

        return this.repositoryBuscarEmpleados.save(employee);
    }


}
