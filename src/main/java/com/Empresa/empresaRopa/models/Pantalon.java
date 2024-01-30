package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Pantalones")
@Getter
@Setter
public class Pantalon extends Ropa{


    @NonNull
    private String tela;
}
