package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

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
    private List<ComprasEntity> comprasPantalon;
}
