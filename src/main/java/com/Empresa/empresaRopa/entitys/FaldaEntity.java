package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
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
    @OneToMany(mappedBy="falda",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<VentasEntity> ventasFalda = new ArrayList<VentasEntity>();



}
