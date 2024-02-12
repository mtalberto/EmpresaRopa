package com.Empresa.empresaRopa.dto;

import java.util.List;

public class RopaDTO {

    private String talla;

    private String color;

    private String marca;

    private String tiporopa;

    private String largo;

    private int precio;

    private int cantidad;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTiporopa() {
        return tiporopa;
    }

    public void setTiporopa(String tiporopa) {
        this.tiporopa = tiporopa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }


}
