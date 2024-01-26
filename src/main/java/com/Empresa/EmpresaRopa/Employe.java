package com.Empresa.EmpresaRopa;

import jakarta.persistence.*;
import lombok.*;


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
    @Column(nullable=false)
    private String primerApellido;

    @NonNull
    @Column(nullable=false)
    private String segundoApellido;

    @NonNull
    @Column(nullable=false)
    private String nombre;
    @NonNull
    @Column(nullable=false)
    private String email;
    @NonNull
    @Column(nullable=false)
    private String fechaContratado;

    private String fechaDespido;

}
