package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    //mediante el joinColum se añadira una campo mas a la bd que hare de fk con empelados
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empleado_id")

    private EmpleadoEntity empleado;



    //join colum solo se puede usar con entitys
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pantalon_id") // Permite valores nulos
    private PantalonEntity pantalon;

    @NonNull
    @Column(name = "fechaventa", nullable =  false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaVenta;

    //con la anotacion joinColumn no hace referencia un atributo o de la entidad PantalonEEntity
    //joincolum se usa en el lado many!!! no en lado one
    //faldaid sera un campo en tabla ventas
    //falda aqui no es un listoset porque refleja el uno de la relacion
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "falda_id", nullable =  true)//pongo true porque solo añadira una prenda cada vez
    private FaldaEntity falda;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "abrigo_id", nullable =  true)
    private AbrigoEntity abrigo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "camiseta_id", nullable =  true)
    private CamisetaEntity camiseta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ropainterior_id", nullable =  true)
    private RopaInteriorEntity ropaInterior;


    @Column(name = "cantidad", nullable =  false)
    private Integer cantidad;



}
