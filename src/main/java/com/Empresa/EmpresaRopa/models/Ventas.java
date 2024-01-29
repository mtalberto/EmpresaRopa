package com.Empresa.EmpresaRopa.models;


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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Employe empleado;

    @ManyToOne
    @JoinColumn(name = "id_ropa", nullable = false) // Permite valores nulos

    private Ropa ropa;

    @Column(nullable = false)
    private Timestamp fechaVenta;
}
