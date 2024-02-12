package com.Empresa.empresaRopa.dto;

import com.Empresa.empresaRopa.entitys.ComprasEntity;

import java.sql.Timestamp;
import java.util.List;

public class UsuarioDTO {


    private long id;
    private String nombreUsuario;
    private List<ComprasEntity> ComprasUsuario;
    private String primerApellido;
    private String segundoApellido;
    private String dni;
    private String email;

    }