package com.Empresa.EmpresaRopa.models;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String primerApellido;

    @NonNull
    @Column(nullable = false)
    private String segundoApellido;

    @NonNull
    @Column(nullable = false)
    private String nombre;
    @NonNull
    @Column(nullable = false)
    private String email;
    @NonNull
    @Column(nullable = false)
    private Timestamp fechaContratado;

    private Timestamp fechaDespido;

    @OneToMany(mappedBy = "empleado")
    private List<Ventas> ventas;

}
