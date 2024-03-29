package com.Empresa.empresaRopa.entitys;



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
    @Column( nullable =  false)
    @OneToMany(mappedBy="abrigo",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ComprasEntity> comprasAbrigo ;

    @NonNull()
    @Column(nullable = false,name = "LARGO")
    @NotNull(message = "el campo largo no puede estar vacio")
    private String largo;



}
