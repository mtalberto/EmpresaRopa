package com.Empresa.empresaRopa.servicios;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UsuarioDTO {


    private long id;
    @JsonProperty("usuario")
    private String nombreUsuario;
    private String nombre;
    private List<ComprasDTO> ComprasUsuario;
    private String primerApellido;
    private String segundoApellido;
    private Timestamp fechaNacimiento;
    private String contraseña;
    @Email
    private String email;

    public UsuarioDTO(long id, String nombreUsuario, String nombre, List<ComprasDTO> comprasUsuario, String primerApellido, String segundoApellido, Timestamp fechaNacimiento, String contraseña, String email) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        ComprasUsuario = comprasUsuario;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.email = email;
    }

    public UsuarioDTO(String nombreUsuario, String nombre, String primerApellido, String segundoApellido, Timestamp fechaNacimiento, String contraseña, String email) {
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.email = email;
    }
}