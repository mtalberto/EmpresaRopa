package com.Empresa.empresaRopa.entitys;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Abrigos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class AbrigoEntity extends Ropa {

    @NonNull
    @Column(nullable = false)
    @NotNull(message = "el campo tela no puede estar vacio")
    private String tela;

    @NonNull
    @OneToMany(mappedBy="abrigo",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<VentasEntity> ventasAbrigo = new ArrayList<VentasEntity>();

    @NonNull()
    @Column(nullable = false)
    @NotNull(message = "el campo largo no puede estar vacio")
    private String largo;



}
