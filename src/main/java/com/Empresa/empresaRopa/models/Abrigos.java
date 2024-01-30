package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "Abrigos")
@Getter
@Setter
public class Abrigos extends Ropa {

    @NonNull
    private String tela;

    @NonNull
    private String largo;
    @NonNull

    private String diseño;

}
