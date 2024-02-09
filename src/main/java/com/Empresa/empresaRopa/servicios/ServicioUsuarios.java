package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.repository.RepositoryCompras;
import com.Empresa.empresaRopa.repository.RepositoryUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioUsuarios {

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
     *
     *
     */

    //inyecta las dependecias de repository o lo que es lo mismo la instancia
    @Autowired
    private final RepositoryUsuarios repositoryUsuarios;
    private final RepositoryCompras repositoryCompras;

    public ServicioUsuarios(RepositoryUsuarios repositoryUsuarios, RepositoryCompras repositoryCompras) {
        this.repositoryUsuarios = repositoryUsuarios;
        this.repositoryCompras = repositoryCompras;
    }


}
