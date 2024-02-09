package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pantalones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PantalonEntity extends Ropa{

    @NonNull
    @OneToMany(mappedBy="pantalon",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ComprasEntity> ventasPantalon= new ArrayList<ComprasEntity>();;
}
