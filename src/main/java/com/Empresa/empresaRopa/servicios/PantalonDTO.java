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
public class PantalonDTO {

    private long id;

    private String talla;

    private String color;

    private Timestamp fcompraAlmacen;

    private String marca;

    private String tiporopa;

    private String nombre;

    private int cantidad;

    private String tela;

    private int precio;

    private List<ComprasEntity> comprasPantalon;

    public PantalonDTO(long id, String talla, String color, Timestamp fcompraAlmacen, String marca, String tiporopa, String nombre, int cantidad, String tela, int precio, List<ComprasEntity> comprasPantalon) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.fcompraAlmacen = fcompraAlmacen;
        this.marca = marca;
        this.tiporopa = tiporopa;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tela = tela;
        this.precio = precio;
        this.comprasPantalon = comprasPantalon;
    }

    public PantalonDTO(long id, String talla, String color, Timestamp fcompraAlmacen, String marca, String tiporopa, String nombre, int cantidad, String tela, int precio) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.fcompraAlmacen = fcompraAlmacen;
        this.marca = marca;
        this.tiporopa = tiporopa;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tela = tela;
        this.precio = precio;
    }
}
