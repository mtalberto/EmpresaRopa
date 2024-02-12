package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table(name = "Compras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ComprasEntity  {
    //en la table many es donde tienes que poner manytoOne
    // especifica el nombre de la secuencia de base de datos que se utilizará
    // para generar los valores de la clave primaria.
    // AL USAR secuencie y apagar y volver a iniciarla me pegaba un salto de ids
    // secuanice lo hace para mejorar el rendimiento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCompra;

    //mediante el joinColum se añadira una campo mas a la bd que hare de fk con empelados
    @ManyToOne
    @JoinColumn(name = "usuarioId")

    private UsuarioEntity usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pantalonId",nullable =  true) // Permite valores nulos

    private PantalonEntity pantalon;

    @NonNull
    @Column(name = "fechaCompra", nullable =  false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")

    private Timestamp fechaCompra;

    //con la anotacion joinColumn no hace referencia un atributo o de la entidad PantalonEEntity
    //joincolum se usa en el lado many!!! no en lado one
    //faldaid sera un campo en tabla ventas
    //falda aqui no es un listoset porque refleja el uno de la relacion
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "faldaId", nullable =  true)//pongo true porque solo añadira una prenda cada vez

    private FaldaEntity falda;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "abrigoId", nullable =  true)

    private AbrigoEntity abrigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "camisetaId", nullable =  true)

    private CamisetaEntity camiseta;


    @Column(name = "cantidad", nullable =  false)
    private Integer cantidad;






}
