package com.Empresa.empresaRopa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//me daba error por que para el controlador, employ y operacionesbuscar empleados
//tienen que estar en el mismo paquete o delos paqeute que deriva la anotacion
//springbootapplication
@SpringBootApplication
public class EmpresaRopaApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmpresaRopaApplication.class, args);

        System.out.println("Creacion de tablas y conexion satisfactoria");

	}

}
