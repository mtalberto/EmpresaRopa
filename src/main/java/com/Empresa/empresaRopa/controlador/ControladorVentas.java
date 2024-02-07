package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    /**
     * Boolean confirmar: Captura un parámetro de consulta opcional llamado confirmar. Si el parámetro
     * no está presente en la solicitud, por defecto se asigna el valor false.
     * @param venta
     * @param idEmpleado
     * @param idRopa
     * @param tiporopa
     * @return
     * @throws Throwable
     */
    @PostMapping("/ventas")
    public VentasEntity addOneVenta(@RequestBody VentasEntity venta, @RequestParam Long idEmpleado,
                                    @RequestParam Long idRopa,
                                    @RequestParam String tiporopa) throws Throwable {
        EmpleadoEntity empleado= repositoryEmpleados.findById(idEmpleado)
                        .orElseThrow(() -> new EntityNotFoundException("Empleado no encontrado"));
            venta.setEmpleado(empleado);

        switch (tiporopa.toLowerCase()) {
            case "abrigo":
                AbrigoEntity abrigo = repositoryAbrigo.findById(idRopa)
                                .orElseThrow(() -> new EntityNotFoundException("abrigo no encontrada"));
                venta.setAbrigo(abrigo);
                break;
            case "falda":
                FaldaEntity falda = repositoryFalda.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("Falda no encontrada"));
                venta.setFalda(falda);
                break;
            case "camiseta":
                CamisetaEntity camiseta = repositorCamiseta.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("Camiseta no encontrada"));
                venta.setCamiseta(camiseta);
                break;

            case "pantalon":
                PantalonEntity pantalon = null;
                try {
                    pantalon = repositoryPantalon.findById(idRopa)
                            .orElseThrow(() -> new EntityNotFoundException("pantalon no encontrado"));
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                venta.setPantalon(pantalon);
                break;
            case "ropainterior":
                RopaInteriorEntity ropaInterior = repositoryRopaInterior.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("ropa interior no encontrada"));
                venta.setRopaInterior(ropaInterior);
                break;


            default:
                throw new IllegalArgumentException("Tipo de prenda no soportado");
        }
        return this.repositoryVentas.save(venta);
    }

    @GetMapping("/ventas")
    /**
     * @return ventas
     */
    public Iterable<VentasEntity> findAllVentas() {

        return this.repositoryVentas.findAll();
    }

}