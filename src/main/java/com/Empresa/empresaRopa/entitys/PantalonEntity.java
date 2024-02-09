package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
    @OneToMany(mappedBy="pantalon",fetch = FetchType.EAGER)
    private List<ComprasEntity> ventasPantalon;
}
