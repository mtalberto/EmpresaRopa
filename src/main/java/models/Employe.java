package models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "employe")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String PrimerApellido;

    @NonNull
    private String SegundoApellido;

    @NonNull
    private String nombre;
    @NonNull
    private String email;
    @NonNull
    private String fechaContratado;

    private String fechaDespido;

}
