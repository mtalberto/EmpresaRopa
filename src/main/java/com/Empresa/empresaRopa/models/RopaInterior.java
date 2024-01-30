package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "RopaInterior")
@Getter
@Setter
public class RopaInterior extends Ropa{


    //calconcillos o bragas .. etc

    @NonNull
    private String tela;


}
