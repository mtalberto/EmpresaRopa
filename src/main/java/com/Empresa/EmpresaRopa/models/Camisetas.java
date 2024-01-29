package com.Empresa.EmpresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Camisetas")
@Getter
@Setter
public class Camisetas extends Ropa {

    private String tela;
    private String bolsillo;

    private String cuello;

    private String botones;
}
