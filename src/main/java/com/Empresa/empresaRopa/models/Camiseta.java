package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "Camisetas")
@Getter
@Setter
public class Camiseta extends Ropa {
    @NonNull
    private String tela;
    @NonNull
    private String bolsillo;
    @NonNull
    private String cuello;
    @NonNull
    private String botones;



}
