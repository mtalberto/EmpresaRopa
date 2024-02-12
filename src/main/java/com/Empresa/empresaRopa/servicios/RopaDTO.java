package com.Empresa.empresaRopa.servicios;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class RopaDTO {

    private long id;

    private String talla;

    private String color;

    private String marca;

    private String tiporopa;

    private String largo;

    private int precio;

    private int cantidad;


    public RopaDTO(long id, String talla, String color, String marca, String tiporopa, String largo, int precio, int cantidad) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.marca = marca;
        this.tiporopa = tiporopa;
        this.largo = largo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
