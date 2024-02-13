package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import com.Empresa.empresaRopa.repository.RepositoryCompras;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioUsuarios {
    //El SERVICIO SE CONECTA CON EL REPOSITORIOS PARA EL MANEJO DE DATOS
    /**
     * @Autowired hacen que tu código sea más limpio, más modular, y más fácil de testear.
     * No tienes que preocuparte por cómo se crean e inicializan tus dependencias
     * dependencia" en el contexto de la programación y, más específicamente, en el desarrollo de software,
     * se refiere a un
     * fragmento de código o una pieza de software que otro fragmento de código necesita para funcionar
     */
    /**
     * @Transactional maneja la apertura y el cierre de transacciones automáticamente,
     * lo que es útil en operaciones que involucran múltiples pasos o consultas.
     */

    //inyecta las dependecias de repository o lo que es lo mismo la instancia

    private final RepositoryUsuarios repositoryUsuarios;
    private final RepositoryCompras repositoryCompras;

    public ServicioUsuarios(RepositoryUsuarios repositoryUsuarios, RepositoryCompras repositoryCompras) {
        this.repositoryUsuarios = repositoryUsuarios;
        this.repositoryCompras = repositoryCompras;
    }

    public UsuarioDTO crearUsuario(UsuarioDTO usuario) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setId(usuario.getId());
        usuarioEntity.setContraseña(usuario.getContraseña());
        usuarioEntity.setUsuario(usuario.getNombreUsuario());
        usuarioEntity.setFechaNacimiento(usuario.getFechaNacimiento());
        usuarioEntity.setNombre(usuario.getNombre());
        usuarioEntity.setPrimerApellido(usuario.getPrimerApellido());
        usuarioEntity.setSegundoApellido(usuario.getSegundoApellido());
        usuarioEntity.setEmail(usuario.getEmail());
        // Aquí puedes manejar la conversión de ComprasDTO a entidades si es necesario
        // usuarioEntity.setCompras(...);

        usuarioEntity = repositoryUsuarios.save(usuarioEntity);
        // Actualizar el ID en caso de que se genere automáticamente
        usuario.setId(usuarioEntity.getId());

        return usuario;

    }

    /**
     * buscar usuario por email,nombreusuario y id
     * @param nombreUsuario
     * @param email
     * @param id
     * @return
     */

    public Optional<UsuarioDTO> buscarUsuario(String nombreUsuario, String email, long id) {
        Optional<UsuarioEntity> usuarioEntity = repositoryUsuarios.findByNombreUsuarioAndEmailAndId(nombreUsuario, email,id);

        // Convertir UsuarioEntity a UsuarioDTO si está presente
        //u es un objeto de usuarioEntity
        return usuarioEntity.map(usuario -> {
            return datosDTO(usuario);
        });


    }

    /**
     * listamos todos los usarios menos sus listas de compra
     * utilizamos stream() y map()
     * solo las compras por cada usuario no la compra de todos los usuarios
     * para transformar cada UsuarioEntity en un UsuarioDTO
     * @return
     */

    public List<UsuarioDTO> findListaUsuariosSinCompras(){
        List<UsuarioEntity>listaUsuarios=repositoryUsuarios.findByListaUsuarios();

        List<UsuarioDTO> listUsuarios= listaUsuarios.stream().map(usuarioEntity -> {
            return datosDTO(usuarioEntity);
        }).collect(Collectors.toList());

        return   listUsuarios;


    }

    /**
     * codigo reutilizable para convertir data transfer objet DTO una entity
     * reutilizable
     * @param usuarioEntity
     * @return
     */
    private  UsuarioDTO datosDTO(UsuarioEntity usuarioEntity){
        UsuarioDTO usuario= new UsuarioDTO();
        usuario.setId(usuarioEntity.getId());
        usuario.setNombre(usuarioEntity.getNombre());
        usuario.setPrimerApellido(usuarioEntity.getPrimerApellido());
        usuario.setSegundoApellido(usuarioEntity.getSegundoApellido());
        usuario.setNombreUsuario(usuarioEntity.getUsuario());
        usuario.setFechaNacimiento(usuarioEntity.getFechaNacimiento());
        usuario.setEmail(usuarioEntity.getEmail());
        return usuario;

    }

}
