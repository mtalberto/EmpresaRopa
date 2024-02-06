package com.Empresa.empresaRopa.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import lombok.*;

import java.sql.Timestamp;


@Entity
@Table(name = "Ventas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class VentasEntity {
    //en la table many es donde tienes que poner manytoOne
    // especifica el nombre de la secuencia de base de datos que se utilizará
    // para generar los valores de la clave primaria.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //mediante el joinColum se añadira una campo mas a la bd que hare de fk con empelados
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private EmpleadoEntity empleadoEntity;


    //join colum solo se puede usar con entitys
    @ManyToOne
    @JoinColumn(name = "pantalon_id") // Permite valores nulos
    private PantalonEntity pantalonEntity;

    @NonNull
    @Column(name = "fechaventa", nullable =  false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaVenta;

    //con la anotacion joinColumn no hace referenci a un atributo o de la entidad PantalonEEntity
    //faldaid sera un campo en tabla ventas
    @ManyToOne
    @JoinColumn(name = "falda_id", nullable =  true)//pongo true porque solo añadira una prenda cada vez
    private FaldaEntity faldaEntity;

    @ManyToOne
    @JoinColumn(name = "abrigo_id", nullable =  true)
    private AbrigoEntity abrigoEntity;

    @ManyToOne
    @JoinColumn(name = "camiseta_id", nullable =  true)
    private CamisetaEntity camisetaEntity;

    @ManyToOne
    @JoinColumn(name = "ropainterior_id", nullable =  true)
    private RopaInteriorEntity ropaInteriorEntity;


    @Column(name = "cantidad", nullable =  false)
    private Integer cantidad;
;
}
