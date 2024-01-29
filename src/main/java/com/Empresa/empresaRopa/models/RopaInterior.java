package com.Empresa.empresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.*;

@Entity
@Table(name = "RopaInterior")
@Getter
@Setter
public class RopaInterior extends Ropa{


    //calconcillos o bragas .. etc

    @NonNull
    @Column(nullable = false)
    private String tipo;


}
