package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Camisetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CamisetaEntity extends Ropa {

    @NonNull
    @Column( nullable =  false,name = "COMPRA_CAMISETA")
    @OneToMany(mappedBy="camiseta",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ComprasEntity> compraCamiseta;




}
