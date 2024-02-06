package com.Empresa.empresaRopa.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "Faldas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaldaEntity extends Ropa{


    @NonNull
    @Column(nullable = false)
    private String tela;
    @NonNull
    @OneToMany(mappedBy="falda")
    private List<VentasEntity> ventas;



}
