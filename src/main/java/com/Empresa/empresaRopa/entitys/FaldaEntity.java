package com.Empresa.empresaRopa.entitys;


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

    //one to many hace referencia al campo faldas de ventasentity
    // en la relacion onetomany el lado muchos sera una coleccion
    @NonNull
    @OneToMany(mappedBy="falda")
    private List<VentasEntity> ventas;



}
