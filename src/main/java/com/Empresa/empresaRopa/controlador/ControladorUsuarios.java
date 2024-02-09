package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.dto.UsuarioDTO;
import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import com.Empresa.empresaRopa.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/RecursosHumanos")
public class ControladorUsuarios {

    @Autowired
    private final ServicioUsuarios servicioUsuarios;
    @Autowired
    private final RepositoryUsuarios repositoryUsuarios;




    public ControladorUsuarios(RepositoryUsuarios repositoryUsuarios, ServicioUsuarios servicioUsuarios) {
        this.repositoryUsuarios = repositoryUsuarios;
        this.servicioUsuarios = servicioUsuarios;
    }


    @GetMapping("/empleados")

    public List<UsuarioEntity> findAllEmpleados() {

        return (List<UsuarioEntity>) this.repositoryUsuarios.findAll();
    }

    @PostMapping("/empleados")
    public UsuarioEntity addEmpleado(@RequestBody UsuarioEntity usuarioEntity){

        return this.repositoryUsuarios.save(usuarioEntity);
    }

    @DeleteMapping("/empleado/{id}")

    public ResponseEntity<Boolean> deleteEmpleado(@PathVariable Long id){
        Optional<UsuarioEntity> empleado= repositoryUsuarios.findById(id);
        if (!empleado.isPresent()) {
           throw  new RuntimeException("No hay empleado con ese"+id);
        }
        repositoryUsuarios.delete(empleado.get());
        return  ResponseEntity.ok(true);
    }


    @PutMapping("/empleado/{id}")

    public ResponseEntity<UsuarioEntity> updateEmpleado(@PathVariable Long id, @RequestBody UsuarioEntity empleadoupdate){
        Optional<UsuarioEntity> empleado= repositoryUsuarios.findById(id);
        if (!empleado.isPresent()) {
            throw  new RuntimeException("No hay empleado con ese"+id);
        }
        //buscamos el usuario
        UsuarioEntity emp=empleado.get();
        //copiamos sus nuevos datos
        emp.copyDataFromEmpleado(empleadoupdate);
        //lo guardamos
        UsuarioEntity empleadoSaved= repositoryUsuarios.save(empleadoupdate);
        return  ResponseEntity.ok(empleadoupdate);
    }

    @PutMapping("/empleado/{empId}/ventas/{ventaId}")
    public UsuarioEntity ventaEmpleado(
            @PathVariable Long empId,
            @PathVariable Long ventaId
    ){
        return servicioUsuarios.obtenerVentasAsociadasEmpleado(empId, ventaId);
    }
    @GetMapping("/empleados/ventas")
    public ResponseEntity<List<UsuarioDTO>> obtenerVentasPorEmpleado() {
        List<UsuarioDTO> ventas = servicioUsuarios.obtenerVentasPorEmpleado();
        return ResponseEntity.ok(ventas);
    }
}
