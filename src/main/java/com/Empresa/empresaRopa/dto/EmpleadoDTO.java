package com.Empresa.empresaRopa.dto;

import com.Empresa.empresaRopa.entitys.VentasEntity;

import java.sql.Timestamp;
import java.util.List;

public class EmpleadoDTO {


    private long id;
    private List<VentasEntity> ventaEmpleado;
    private String segundoApellido;
    private String dni;
    private String nombre;
    private String email;
    private Timestamp fechaContratado;
    private Timestamp fechaDespido;

    public EmpleadoDTO(long id, List<VentasEntity> ventaEmpleado, String segundoApellido, String dni, String nombre, String email, Timestamp fechaContratado, Timestamp fechaDespido) {
        this.id = id;
        this.nombre = nombre;

        this.segundoApellido = segundoApellido;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.fechaContratado = fechaContratado;
        this.fechaDespido = fechaDespido;
    }



    public EmpleadoDTO(String nombre, List<VentasEntity> ventaEmpleado){
        this.nombre = nombre;
        this.nombre = nombre;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<VentasEntity> getVentaEmpleado() {
        return ventaEmpleado;
    }

    public void setVentaEmpleado(List<VentasEntity> ventaEmpleado) {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
                ", ventaEmpleado=" + ventaEmpleado +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaContratado=" + fechaContratado +
                ", fechaDespido=" + fechaDespido +
                '}';
    }
}