package com.Empresa.empresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "RopaInterior")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RopaInteriorEntity extends Ropa{


    @NonNull
    @Column(nullable = false)
    private String tela;


}
