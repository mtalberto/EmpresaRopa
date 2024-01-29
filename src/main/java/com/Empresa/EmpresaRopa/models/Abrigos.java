package com.Empresa.EmpresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NonNull;
import lombok.*;

@Entity
@Table(name = "Abrigos")
@Getter
@Setter
public class Abrigos extends Ropa {

    @NonNull
    @Column(nullable = false)
    private String tela;

    @NonNull
    @Column(nullable = false)
    private String largo;

}
