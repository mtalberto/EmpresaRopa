package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.entitys.EmpleadoEntity;
import com.Empresa.empresaRopa.entitys.VentasEntity;
import com.Empresa.empresaRopa.repository.RepositoryEmpleados;
import com.Empresa.empresaRopa.repository.RepositoryVentas;
import com.Empresa.empresaRopa.servicios.ServicioEmpleados;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/RecursosHumanos")
public class ControladorEmpleados {
    @Autowired
    private final RepositoryEmpleados repositoryEmpleados;

    @Autowired
    private final ServicioEmpleados servicioEmpleados;


    public ControladorEmpleados(RepositoryEmpleados repositoryEmpleados, ServicioEmpleados servicioEmpleados) {
        this.repositoryEmpleados = repositoryEmpleados;

        this.servicioEmpleados = servicioEmpleados;
    }


    @GetMapping("/empleados")

    public Iterable<EmpleadoEntity> findAllEmpleados() {

        return this.repositoryEmpleados.findAll();
    }

    @PostMapping("/empleados")
    public EmpleadoEntity addEmpleado(@RequestBody EmpleadoEntity empleadoEntity){

        return this.repositoryEmpleados.save(empleadoEntity);
    }

    @DeleteMapping("/empleado/{id}")

    public ResponseEntity<Boolean> deleteEmpleado(@PathVariable Long id){
        Optional<EmpleadoEntity> empleado=repositoryEmpleados.findById(id);
        if (!empleado.isPresent()) {
           throw  new RuntimeException("No hay empleado con ese"+id);
        }
        repositoryEmpleados.delete(empleado.get());
        return  ResponseEntity.ok(true);
    }


    @PutMapping("/empleado/{id}")

    public ResponseEntity<EmpleadoEntity> updateEmpleado(@PathVariable Long id,@RequestBody EmpleadoEntity empleadoupdate){
        Optional<EmpleadoEntity> empleado=repositoryEmpleados.findById(id);
        if (!empleado.isPresent()) {
            throw  new RuntimeException("No hay empleado con ese"+id);
        }
        //buscamos el usuario
        EmpleadoEntity emp=empleado.get();
        //copiamos sus nuevos datos
        emp.copyDataFromEmpleado(empleadoupdate);
        //lo guardamos
        EmpleadoEntity empleadoSaved=repositoryEmpleados.save(empleadoupdate);
        return  ResponseEntity.ok(empleadoupdate);
    }

    @PutMapping("/empleado/{empId}/ventas/{ventaId}")
    public EmpleadoEntity ventaEmpleado(
            @PathVariable Long empId,
            @PathVariable Long ventaId
    ){
        return servicioEmpleados.obtenerVentasAsociadasEmpleado(empId, ventaId);
    }
}
