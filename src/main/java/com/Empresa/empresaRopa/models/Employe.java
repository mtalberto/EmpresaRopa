package com.Empresa.empresaRopa.models;

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
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;

    @NonNull
    @Column(nullable = false)
    private String primerApellido;

    @NonNull
    @Column(nullable = false)
    private String segundoApellido;

    @NonNull
    @Column(nullable = false)
    private String nombre;
    @Email
    @NonNull
    @Column(nullable = false)
    private String email;

    @NonNull
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaContratado;
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp fechaDespido;

    @OneToMany(mappedBy = "empleado")
    private List<Ventas> ventas;

}
