package com.Empresa.empresaRopa.dto;

import com.Empresa.empresaRopa.entitys.ComprasEntity;

import java.sql.Timestamp;
import java.util.List;

public class UsuarioDTO {


    private long id;
    private String nombreEmpleado;
    private long cantidadVendida;
    private List<ComprasEntity> ventaEmpleado;
    private String segundoApellido;
    private String dni;

    private String email;
    private Timestamp fechaContratado;
    private Timestamp fechaDespido;

    public UsuarioDTO(long id, List<ComprasEntity> ventaEmpleado, String nombreEmpleado, long cantidadVendida, String segundoApellido, String dni, String email, Timestamp fechaContratado, Timestamp fechaDespido) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.cantidadVendida = cantidadVendida;
        this.segundoApellido = segundoApellido;
        this.dni = dni;
        this.email = email;
        this.fechaContratado = fechaContratado;
        this.fechaDespido = fechaDespido;
    }



    public UsuarioDTO(String nombreEmpleado, long cantidadVendida){

        this.nombreEmpleado = nombreEmpleado;

        this.cantidadVendida = cantidadVendida;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ComprasEntity> getVentaEmpleado() {
        return ventaEmpleado;
    }

    public void setVentaEmpleado(List<ComprasEntity> ventaEmpleado) {
        this.ventaEmpleado = ventaEmpleado;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getFechaContratado() {
        return fechaContratado;
    }

    public void setFechaContratado(Timestamp fechaContratado) {
        this.fechaContratado = fechaContratado;
    }

    public Timestamp getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(Timestamp fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", cantidadVendida=" + cantidadVendida +
                ", ventaEmpleado=" + ventaEmpleado +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", fechaContratado=" + fechaContratado +
                ", fechaDespido=" + fechaDespido +
                '}';
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public long getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(long cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}