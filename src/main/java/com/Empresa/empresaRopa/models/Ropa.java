package com.Empresa.empresaRopa.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
public class Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ropa;


    @Column(nullable = false)
    private String talla;


    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fCompraAlmacen;

    @NonNull
    private String marca;

    @NonNull
    private String tipo;

    @NonNull
    private String nombre;

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
