package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import lombok.*;

import java.sql.Timestamp;


@Entity
@Table(name = "Compras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class ComprasEntity {
    //en la table many es donde tienes que poner manytoOne
    // especifica el nombre de la secuencia de base de datos que se utilizará
    // para generar los valores de la clave primaria.
    // AL USAR secuencie y apagar y volver a iniciarla me pegaba un salto de ids
    // secuanice lo hace para mejorar el rendimiento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //mediante el joinColum se añadira una campo mas a la bd que hare de fk con empelados
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private UsuarioEntity empleado ;



    //join colum solo se puede usar con entitys
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pantalon_id",nullable =  true) // Permite valores nulos
    private PantalonEntity pantalon;

    @NonNull
    @Column(name = "fechaventa", nullable =  false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaVenta;

    //con la anotacion joinColumn no hace referencia un atributo o de la entidad PantalonEEntity
    //joincolum se usa en el lado many!!! no en lado one
    //faldaid sera un campo en tabla ventas
    //falda aqui no es un listoset porque refleja el uno de la relacion
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "falda_id", nullable =  true)//pongo true porque solo añadira una prenda cada vez
    private FaldaEntity falda;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "abrigo_id", nullable =  true)
    private AbrigoEntity abrigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "camiseta_id", nullable =  true)
    private CamisetaEntity camiseta;


    @Column(name = "cantidad", nullable =  false)
    private Integer cantidad;



}
