package com.Empresa.empresaRopa.servicios;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class ComprasDTO {

    private long idcompra;

    private AbrigoDTO abrigo;

    private CamisetaDTO camiseta;

    private FaldaDTO falda;

    private PantalonDTO pantalon;

    private UsuarioDTO usuario;

    private Timestamp fechaCompra;

    private Integer cantidad;


    public ComprasDTO(long idcompra, AbrigoDTO abrigo, CamisetaDTO camiseta, com.Empresa.empresaRopa.servicios.FaldaDTO falda, PantalonDTO pantalon, UsuarioDTO usuario, Timestamp fechaCompra, Integer cantidad) {
        this.idcompra = idcompra;
        this.abrigo = abrigo;
        this.camiseta = camiseta;
        this.falda = falda;
        this.pantalon = pantalon;
        this.usuario = usuario;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
    }
}
