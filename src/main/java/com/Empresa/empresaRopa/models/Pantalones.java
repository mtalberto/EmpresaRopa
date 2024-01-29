package com.Empresa.empresaRopa.models;


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
    private String diseño;
}