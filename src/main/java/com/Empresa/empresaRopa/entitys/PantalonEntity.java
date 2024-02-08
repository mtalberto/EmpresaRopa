package com.Empresa.empresaRopa.entitys;


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
    @Column(nullable = false)
    private String tela;
    @NonNull
    @OneToMany(mappedBy="pantalon",fetch = FetchType.EAGER)
    private List<VentasEntity> ventas;
}
