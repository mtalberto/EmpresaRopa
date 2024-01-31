package com.Empresa.empresaRopa.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Abrigos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class AbrigoEntity extends Ropa {

    @NonNull
    private String tela;



    @NonNull
    private String largo;



}
