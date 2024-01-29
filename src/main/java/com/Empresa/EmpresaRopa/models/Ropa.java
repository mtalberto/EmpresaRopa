package com.Empresa.EmpresaRopa.models;

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
    private Timestamp fCompraAlmacen;

    private Timestamp fVenta;

    private long idempleado_venta;
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
