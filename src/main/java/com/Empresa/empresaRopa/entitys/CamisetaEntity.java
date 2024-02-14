package com.Empresa.empresaRopa.entitys;



import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Table(name = "Camisetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CamisetaEntity extends Ropa {

    @NonNull
    @Column( nullable =  false)
    @OneToMany(mappedBy="camiseta",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ComprasEntity> compraCamiseta;




}
