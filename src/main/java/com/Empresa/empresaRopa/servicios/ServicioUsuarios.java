package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import com.Empresa.empresaRopa.repository.RepositoryCompras;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import org.springframework.stereotype.Service;

import java.util.Optional;


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

        return usuario; // Puedes necesitar convertir usuarioEntity de nuevo a UsuarioDTO si se actualizó algo durante el guardado

    }

    public Optional<UsuarioDTO> obtenerUsuarioPorNombreUsuarioYEmail(String nombreUsuario, String email) {
        Optional<UsuarioEntity> usuarioEntity = repositoryUsuarios.findByNombreUsuarioAndEmail(nombreUsuario, email);

        // Convertir UsuarioEntity a UsuarioDTO si está presente
        //u es un objeto de usuarioEntity
        return usuarioEntity.map(u -> {
            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setNombre(u.getNombre());
            usuarioDTO.setPrimerApellido(u.getPrimerApellido());
            usuarioDTO.setSegundoApellido(u.getSegundoApellido());
            usuarioDTO.setId(u.getId());
            usuarioDTO.setNombreUsuario(u.getUsuario());
            // Configurar otros campos...
            usuarioDTO.setEmail(u.getEmail());
            return usuarioDTO;
        });


    }
}
