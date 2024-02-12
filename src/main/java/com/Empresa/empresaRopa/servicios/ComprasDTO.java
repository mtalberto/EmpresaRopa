package com.Empresa.empresaRopa.servicios;

import com.Empresa.empresaRopa.entitys.ComprasEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class ComprasDTO {

    private long id;
    private String talla;

    private String color;

    private String marca;

    private String tiporopa;

    private int precio;

    private int cantidad;

    private String primerApellido;
    private String segundoApellido;
    private String email;

    private Timestamp fechaCompra;

    public ComprasDTO(long id, String talla, String color, String marca, String tiporopa, int precio, int cantidad, String primerApellido, String segundoApellido, String email, Timestamp fechaCompra) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.tiporopa = tiporopa;
        this.precio = precio;
        this.cantidad = cantidad;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.email = email;
        this.fechaCompra = fechaCompra;
    }
}
