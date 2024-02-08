package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
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
     @OneToMany(mappedBy="ropaInterior",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<VentasEntity> ventasRopaInterior= new ArrayList<VentasEntity>();;

}
