package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import com.Empresa.empresaRopa.servicios.ServicioUsuarios;
import com.Empresa.empresaRopa.servicios.UsuarioDTO;
import jakarta.validation.Valid;
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

    //obterner usuario por nombreusuario y email
    //usar tokens
    @GetMapping("/BuscarUsuario")
    public ResponseEntity<Optional<UsuarioDTO>> obtenerUsuarioPorNombreYEmail(@Valid @RequestParam String nombreUsuario, @RequestParam String email) {
        Optional<UsuarioDTO> usuarioDTO = servicioUsuarios.obtenerUsuarioPorNombreUsuarioYEmail(nombreUsuario, email);
        if (usuarioDTO != null) {
            return ResponseEntity.ok(usuarioDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/NuevoUsuario") // Define la ruta específica para crear un nuevo usuario
    public ResponseEntity<UsuarioDTO> crearUsuario(@Valid @RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO usuarioCreado = servicioUsuarios.crearUsuario(usuarioDTO);
        return ResponseEntity.ok(usuarioCreado); // Devuelve el usuario creado con un estado HTTP 200 OK
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
