package com.Empresa.empresaRopa.entitys;



import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "Faldas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FaldaEntity extends Ropa{


    //one to many hace referencia al campo faldas de ventasentity
    // en la relacion onetomany el lado muchos sera una coleccion
    @NonNull
    @Column( nullable =  false)
    @OneToMany(mappedBy="falda",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<ComprasEntity> comprasFalda ;



}
