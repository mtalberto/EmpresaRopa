package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import com.Empresa.empresaRopa.servicios.ServicioUsuarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RestController
public class ControladorUsuarios {

    private final ModelAndView mv= new ModelAndView();
    private final ServicioUsuarios servicioUsuarios;

    private final RepositoryUsuarios repositoryUsuarios;




    public ControladorUsuarios(RepositoryUsuarios repositoryUsuarios, ServicioUsuarios servicioUsuarios) {
        this.repositoryUsuarios = repositoryUsuarios;
        this.servicioUsuarios = servicioUsuarios;
    }


    @GetMapping("/ListaUsuarios")

    public List<UsuarioEntity> findAllUsuarios() {

        return (List<UsuarioEntity>) this.repositoryUsuarios.findAll();
    }


    @GetMapping("/Usuario/{idUser}")
    public Optional<UsuarioEntity> findUsuarios(@PathVariable UsuarioEntity usuario) {

        return  this.repositoryUsuarios.findById(usuario.getId());
    }





    @PostMapping("/NuevoUsuario")
    public UsuarioEntity addUsuario(@RequestBody UsuarioEntity usuarioEntity){

        return this.repositoryUsuarios.save(usuarioEntity);
    }

    @DeleteMapping("/Usuario/{idUser}")

    public ResponseEntity<Boolean> deleteUsuario(@PathVariable Long id){
        Optional<UsuarioEntity> usuario = repositoryUsuarios.findById(id);
        if (usuario.isEmpty()) {
           throw  new RuntimeException("No hay usuario con ese"+id);
        }
        repositoryUsuarios.delete(usuario.get());
        return  ResponseEntity.ok(true);
    }



}
