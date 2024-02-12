package com.Empresa.empresaRopa.dto;

import com.Empresa.empresaRopa.entitys.ComprasEntity;

import java.util.List;

public class UsuarioDTO {



    private String nombreUsuario;
    private List<ComprasDTO> ComprasUsuario;
    private String primerApellido;
    private String segundoApellido;
    private String email;




    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<ComprasDTO> getComprasUsuario() {
        return ComprasUsuario;
    }

    public void setComprasUsuario(List<ComprasDTO> comprasUsuario) {
        ComprasUsuario = comprasUsuario;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", ComprasUsuario=" + ComprasUsuario +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}