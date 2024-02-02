package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Table(name = "Camisetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CamisetaEntity extends Ropa {
    @NonNull
    @NotNull(message = "el campo tela no puede estar vacio")
    private String tela;
    @NonNull
    @NotNull(message = "el campo bolsillo no puede estar vacio")
    private String bolsillo;
    @NonNull
    @NotNull(message = "el campo curllo no puede estar vacio")
    private String cuello;
    @NonNull
    @NotNull(message = "el campo botones no puede estar vacio")
    private String botones;





}
