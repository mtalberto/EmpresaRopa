package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Table(name = "Faldas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Falda extends Ropa{


    @NonNull
    private String tela;


    @NonNull
    private String desing;


}
