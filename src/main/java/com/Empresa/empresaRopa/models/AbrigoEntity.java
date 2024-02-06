package com.Empresa.empresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "Abrigos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class AbrigoEntity extends Ropa {

    @NonNull
    @Column(nullable = false)
    @NotNull(message = "el campo tela no puede estar vacio")
    private String tela;

    @NonNull()
    @Column(nullable = false)
    @NotNull(message = "el campo largo no puede estar vacio")
    private String largo;



}
