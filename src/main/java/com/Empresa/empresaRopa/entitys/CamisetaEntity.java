package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "Camisetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CamisetaEntity extends Ropa {
    @NonNull
    @NotNull(message = "el campo tela no puede estar vacio")
    @Column(nullable = false)
    private String tela;
    @NonNull
    @NotNull(message = "el campo bolsillo no puede estar vacio")
    @Column(nullable = false)
    private String bolsillo;
    @NonNull
    @Column(nullable = false)
    @NotNull(message = "el campo curllo no puede estar vacio")
    private String cuello;
    @NonNull
    @Column(nullable = false)
    @NotNull(message = "el campo botones no puede estar vacio")
    private String botones;

    @NonNull
    @OneToMany(mappedBy="camiseta")
    private List<VentasEntity> ventas;




}
