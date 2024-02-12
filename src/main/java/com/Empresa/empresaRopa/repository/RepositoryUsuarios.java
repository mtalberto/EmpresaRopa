package com.Empresa.empresaRopa.repository;

import com.Empresa.empresaRopa.entitys.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositoryUsuarios extends JpaRepository<UsuarioEntity, Long > {
//puedo hacer consultas personalizadas mediante  @Query("SELECT m FROM Modelo m WHERE m.atributo = :atributo")


    /**
     * Los dos puntos (:) indican que lo que sigue es el nombre de un parámetro.
     * Estos nombres son placeholders o marcadores de posición para
     * los valores que se proporcionarán cuando se ejecute la consulta.
     */

    /**
     *
     * @param usuario
     * @param email
     * @return
     */

    @Query("SELECT u FROM UsuarioEntity u WHERE u.usuario = :usuario AND u.email = :email")
    Optional<UsuarioEntity> findByNombreUsuarioAndEmail(String usuario, String email);

}
