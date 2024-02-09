package com.Empresa.empresaRopa.entitys;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Empleados")
public class UsuarioEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotNull(message = "falta el primer apellido")
    private String primerApellido;


    @Column(nullable = false)
    @NotNull(message = "falta el segundo apellido")
    private String segundoApellido;


    @Column(nullable = false,length =9)
    @NotNull(message = "falta el dni apellido")
    private String dni;

    //Email
    @Email
    @Column(nullable = false)
    @NotNull(message = "falta el email apellido")
    private String email;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Timestamp fechaNacimiento;


    @Column(nullable = false)
    @NotNull(message = "falta el email apellido")
    private String usuario;

    @Column(nullable = false)
    @NotNull(message = "falta el email apellido")
    private String contraseña;


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
    private List<ComprasEntity> ventaEmpleado= new ArrayList<ComprasEntity>();




    /**
     * ModelMapper es una librería de mapeo de objetos que automáticamente mapea objetos
     * a otros objetos mediante convenciones de nombres o configuraciones personalizadas.
     * @param source
    */

    public void copyDataFromEmpleado(UsuarioEntity source) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(source, this);
    }
}
