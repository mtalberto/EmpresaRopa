package com.Empresa.empresaRopa.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Empleados")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false)

    private String primerApellido;


    @ManyToOne
    @Column(nullable = false)
    private List<VentasEntity> ventas;

    @Column(nullable = false)
    private String segundoApellido;

    @Column(nullable = false,length =9)
    private String dni;


    @Column(nullable = false)
    private String nombre;

    //Email

    @Email
    @Column(nullable = false)
    private String email;


    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaContratado;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaDespido;
}
