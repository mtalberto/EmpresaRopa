package com.Empresa.EmpresaRopa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    private final OperacionBuscarEmpleados operacionBuscarEmpleados;

    public Controlador(OperacionBuscarEmpleados  operacionBuscar) {
        this.operacionBuscarEmpleados = operacionBuscar;

    }


    @GetMapping("/empleados")
    public Iterable<Employe> findAllEmploye()
    {

        return this.operacionBuscarEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public Employe addOneEmploye(@RequestBody Employe employee)
    {
        return this.operacionBuscarEmpleados.save(employee);
    }
}
