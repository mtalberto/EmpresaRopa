package com.Empresa.empresaRopa.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.sql.Timestamp;

/**
 * para un mayor control de la bd
 * Cuando añades @EntityListeners(AuditingEntityListener.class) a una entidad,
 * habilitas la capacidad de esta entidad para ser auditada automáticamente por Spring Data JPA.
 * Esto significa que puedes utilizar
 * anotaciones adicionales como @CreatedDate, @LastModifiedDate, @CreatedBy, y @LastModifiedBy
 */
@MappedSuperclass

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
// esto solo seria si ropa fuese una entity @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//La anotación @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) es parte de la Java Persistence API (JPA), que se
// utiliza para definir cómo se mapea una jerarquía de clases de Java a una base de datos relacional
public abstract class Ropa  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //TABLE_PER_CLASS hace una tabla de cada herencia

    @Column(nullable = false)
    private String talla;


    @Column(nullable = false)
    private String color;
    //tuve un error en postaman que se me duplicaba la fecha por que antes era fCcompraAlmacen
    // y lo cambie a fcompraAlmacen y no se me duplico
    @Column( nullable =  false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fcompraAlmacen;


    @NonNull
    private String marca;


    @NotNull(message = "inserte imagen")
    private String imagen;

    @Column( nullable =  false,name = "TIPOROPA")
    private String tiporopa;


    @Column( nullable =  false,name = "NOMBRE")
    @NotNull(message = "inserte nombre")
    private String nombre;

    @Column( nullable =  false)
    @NotNull(message = "inserte cantidad")
    private int cantidad;
    @Column( nullable =  false,name = "TELA")
    @NotNull(message = "inserte tela")
    private String tela;

    @Column( nullable =  false,name = "PRECIO")
    @NotNull(message = "inserte precio")
    private int precio;

    //podria pasar el atributo tipo aqui pero es para practicar
     /* sera en el controlador
    @DateTimeFormat se usa en la capa de presentación para controlar
     cómo se formatean y analizan las fechas en las solicitudes y respuestas HTTP,
     */
    /*
    @Temporal se usa en la capa de persistencia para controlar cómo se almacenan las fechas en
    la base de datos. Mezclar estas responsabilidades
    puede llevar a confusión y errores en el código.

     */

}
