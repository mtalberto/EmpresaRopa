package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.*;
import com.Empresa.empresaRopa.repository.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

//Controlador REST
@RestController
public class ControladorVentas {
    private final RepositoryVentas repositoryVentas;
    private final RepositoryEmpleados repositoryEmpleados;

    private final RepositoryAbrigo repositoryAbrigo;

    private final RepositorCamiseta repositorCamiseta;

    private final RepositoryRopaInterior repositoryRopaInterior;

    private final RepositoryPantalon repositoryPantalon;

    private final RepositoryFalda repositoryFalda;



    public ControladorVentas(RepositoryVentas repositoryVentas, RepositoryEmpleados repositoryEmpleados, RepositoryAbrigo repositoryAbrigo, RepositorCamiseta repositorCamiseta, RepositoryRopaInterior repositoryRopaInterior, RepositoryPantalon repositoryPantalon, RepositoryFalda repositoryFalda) {
        this.repositoryVentas = repositoryVentas;
        this.repositoryEmpleados = repositoryEmpleados;
        this.repositoryAbrigo = repositoryAbrigo;
        this.repositorCamiseta = repositorCamiseta;
        this.repositoryRopaInterior = repositoryRopaInterior;
        this.repositoryPantalon = repositoryPantalon;
        this.repositoryFalda = repositoryFalda;
    }
//@RequestBody) se espera que sea un objeto Ventas, que se guarda en la base de datos.
    //debees recibir el id del empleado como parametro de la consulta
    @PostMapping("/ventas")
    public VentasEntity addOneVenta(@RequestBody VentasEntity venta, @RequestParam Long id_empleado, @RequestParam  Long id_ropa,@RequestParam String tipo) {
        EmpleadoEntity empleado= repositoryEmpleados.findById(id_empleado)
                        .orElseThrow(() -> new EntityNotFoundException("Empleado no encontrado"));
            venta.setEmpleado(empleado);

        switch (tipo.toLowerCase()) {
            case "abrigo":
                AbrigoEntity abrigo = repositoryAbrigo.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Abrigo no encontrado"));
                venta.setAbrigo(abrigo);
                break;
            case "falda":
                FaldaEntity falda = repositoryFalda.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Falda no encontrada"));
                venta.setFalda(falda);
                break;
            case "camiseta":
                CamisetaEntity camiseta = repositorCamiseta.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Camiseta no encontrada"));
                venta.setCamiseta(camiseta);
                break;

            case "pantalon":
                PantalonEntity pantalon = repositoryPantalon.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("pantalon no encontrado"));
                venta.setPantalon(pantalon);
                break;
            case "ropainterior":
                RopaInteriorEntity ropaInterior = repositoryRopaInterior.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("ropa interior no encontrada"));
                venta.setRopaInterior(ropaInterior);
                break;


            default:
                throw new IllegalArgumentException("Tipo de prenda no soportado");
        }
        return this.repositoryVentas.save(venta);
    }

    @GetMapping("/ventas")
    public Iterable<VentasEntity> findAllVenyas() {

        return this.repositoryVentas.findAll();
    }

}