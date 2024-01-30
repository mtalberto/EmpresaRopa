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
public class Ventas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "Empleado", nullable = true)
    private Empleado empleado;
// sera un fk con el tipo de roba
    @Column(name = "Prenda", nullable =  false)
    private String prenda;

    @ManyToOne
    @JoinColumn(name = "Pantalon", nullable =  true) // Permite valores nulos
    private Pantalon pantalon;

    @NonNull
    @Column(name = "fechaventa", nullable =  true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaVenta;

    @ManyToOne
    @JoinColumn(name = "falda", nullable =  true)//pongo true porque solo añadira una prenda cada vez
    private Falda falda;

    @ManyToOne
    @JoinColumn(name = "abrigo", nullable =  true)
    private Abrigo abrigo;

    @ManyToOne
    @JoinColumn(name = "camiseta", nullable =  true)
    private Camiseta camiseta;

    @ManyToOne
    @JoinColumn(name = "ropainterior", nullable =  true)
    private RopaInterior ropaInterior;


    @Column(name = "cantidad", nullable =  false)
    private Integer cantidad;
}
