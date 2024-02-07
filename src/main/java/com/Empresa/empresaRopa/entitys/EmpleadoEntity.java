package com.Empresa.empresaRopa.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Empleados")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(nullable = false)

    private String primerApellido;

    /**
     * cambia la estrategia de carga de la colección asociada de carga perezosa
     * (LAZY, el valor predeterminado) a carga ansiosa (EAGER)
     * fetch = FetchType.EAGER me dabe error si no me cargaba
     * Y carga todas las conlecciones
     *
     * Could not write JSON: failed to lazily initialize a collection of role:  de la tabla ventas
     */
    //@mappeby señalas el campo de ventas con el que tiene relacion
    @OneToMany(mappedBy = "empleado",fetch = FetchType.EAGER)
    private List<VentasEntity> ventas;

    @Column(nullable = false)
    private String segundoApellido;

    @Column(nullable = false,length =9)
    private String dni;


    @Column(nullable = false)
    private String nombre;

    //Email

    @Email
    @Column(nullable = false)
    private String email;


    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")

    private Timestamp fechaContratado;

    @Column(nullable = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaDespido;

    /**
     * ModelMapper es una librería de mapeo de objetos que automáticamente mapea objetos
     * a otros objetos mediante convenciones de nombres o configuraciones personalizadas.
     * @param source
     */
    public void copyDataFromEmpleado(EmpleadoEntity source) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(source, this);
    }
}
