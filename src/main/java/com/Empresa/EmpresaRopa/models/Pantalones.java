package com.Empresa.EmpresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.*;

@Entity
@Table(name = "Pantalones")
@Getter
@Setter
public class Pantalones extends Ropa{


    @NonNull
    @Column(nullable = false)
    private String tipo;
}
