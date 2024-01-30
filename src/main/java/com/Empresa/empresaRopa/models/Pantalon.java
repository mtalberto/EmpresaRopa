package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Pantalones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pantalon extends Ropa{


    @NonNull
    private String tela;
}
