package com.Empresa.empresaRopa.models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;


@Entity
@Table(name = "ventas")
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
    @JoinColumn(name = "id_empleado", nullable = false)
    private Employe empleado;

    @ManyToOne
    @JoinColumn(name = "id_ropa", nullable = false) // Permite valores nulos
    private Pantalon pantalon;

    @NonNull
    @Column(name = "fechaventa", nullable = false)
    private Timestamp fechaVenta;

    @ManyToOne
    @JoinColumn(name = "id_falda", nullable = true)//pongo true porque solo añadira una prenda cada vez
    private Falda falda;

    @ManyToOne
    @JoinColumn(name = "id_abrigo", nullable = true)
    private Abrigo abrigo;

    @ManyToOne
    @JoinColumn(name = "id_camisetas", nullable = true)
    private Camiseta camiseta;

    @ManyToOne
    @JoinColumn(name = "id_ropainterior", nullable = true)
    private RopaInterior ropaInterior;
}
