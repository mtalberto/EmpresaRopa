package com.Empresa.empresaRopa.entitys;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Abrigos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class AbrigoEntity extends Ropa {

   

    @NonNull
    @Column( nullable =  false,name = "COMPRA_ABRIGO")
    @OneToMany(mappedBy="abrigo",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ComprasEntity> comprasAbrigo ;

    @NonNull()
    @Column(nullable = false,name = "LARGO")
    @NotNull(message = "el campo largo no puede estar vacio")
    private String largo;



}
