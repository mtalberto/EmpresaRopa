package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    @OneToMany(mappedBy="pantalon")
    private List<VentasEntity> ventas;
}
