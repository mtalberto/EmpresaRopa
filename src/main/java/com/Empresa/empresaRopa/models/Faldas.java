package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NonNull;
import lombok.*;

@Entity
@Table(name = "Faldas")
@Getter
@Setter
public class Faldas extends Ropa{


    @NonNull
    private String tela;


    @NonNull
    private String diseño;


}