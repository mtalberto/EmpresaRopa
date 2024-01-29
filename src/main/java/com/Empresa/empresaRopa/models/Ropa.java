package com.Empresa.empresaRopa.models;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Timestamp;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ropa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String talla;

    @NonNull
    @Column(nullable = false)
    private String color;

    @NonNull
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fCompraAlmacen;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fVenta;

    private long idempleado_venta;
    @NonNull
    private String marca;

    @NonNull
    private String tipo;
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