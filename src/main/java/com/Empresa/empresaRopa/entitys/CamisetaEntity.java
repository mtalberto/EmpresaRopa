package com.Empresa.empresaRopa.entitys;


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
    @OneToMany(mappedBy="camiseta",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<ComprasEntity> ventasCamiseta= new ArrayList<ComprasEntity>();




}
