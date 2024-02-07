package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "RopaInterior")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RopaInteriorEntity extends Ropa{


    @NonNull
    @Column(nullable = false)
    private String tela;
    @NonNull
    @OneToMany(mappedBy="ropaInterior")
    private List<VentasEntity> ventas;

}
