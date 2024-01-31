package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.web.bind.annotation.*;

//Controlador REST
@RestController
public class ControladorVentas {
    private final RepositoryBuscarVentas repositoryBuscarVentas;
    private final RepositoryBuscarEmpleados repositoryBuscarEmpleados;

    private final RepositoryBuscarAbrigo repositoryBuscarAbrigo;

    private final RepositoryBuscarCamiseta repositoryBuscarCamiseta;

    private final RepositoryBuscarRopaInterior repositoryBuscarRopaInterior;

    private final RepositoryBuscarPantalon repositoryBuscarPantalon;

    private final RepositoryBuscarFalda repositoryBuscarFalda;



    public ControladorVentas(RepositoryBuscarVentas repositoryBuscarVentas, RepositoryBuscarEmpleados repositoryBuscarEmpleados, RepositoryBuscarAbrigo repositoryBuscarAbrigo, RepositoryBuscarCamiseta repositoryBuscarCamiseta, RepositoryBuscarRopaInterior repositoryBuscarRopaInterior, RepositoryBuscarPantalon repositoryBuscarPantalon, RepositoryBuscarFalda repositoryBuscarFalda) {
        this.repositoryBuscarVentas = repositoryBuscarVentas;
        this.repositoryBuscarEmpleados = repositoryBuscarEmpleados;
        this.repositoryBuscarAbrigo = repositoryBuscarAbrigo;
        this.repositoryBuscarCamiseta = repositoryBuscarCamiseta;
        this.repositoryBuscarRopaInterior = repositoryBuscarRopaInterior;
        this.repositoryBuscarPantalon = repositoryBuscarPantalon;
        this.repositoryBuscarFalda = repositoryBuscarFalda;
    }
//@RequestBody) se espera que sea un objeto Ventas, que se guarda en la base de datos.
    //debees recibir el id del empleado como parametro de la consulta
    @PostMapping("/ventas")
    public VentasEntity addOneVenta(@RequestBody VentasEntity venta, @RequestParam Long id_empleado, @RequestParam  Long id_ropa,@RequestParam String tipo) {
        EmpleadoEntity empleado=repositoryBuscarEmpleados.findById(id_empleado)
                        .orElseThrow(() -> new EntityNotFoundException("Empleado no encontrado"));
            venta.setEmpleadoEntity(empleado);

        switch (tipo.toLowerCase()) {
            case "abrigo":
                AbrigoEntity abrigo = repositoryBuscarAbrigo.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Abrigo no encontrado"));
                venta.setAbrigoEntity(abrigo);
                break;
            case "falda":
                FaldaEntity falda = repositoryBuscarFalda.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Falda no encontrada"));
                venta.setFaldaEntity(falda);
                break;
            case "camiseta":
                CamisetaEntity camiseta = repositoryBuscarCamiseta.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("Camiseta no encontrada"));
                venta.setCamisetaEntity(camiseta);
                break;

            case "pantalon":
                PantalonEntity pantalon = repositoryBuscarPantalon.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("pantalon no encontrado"));
                venta.setPantalonEntity(pantalon);
                break;
            case "ropainterior":
                RopaInteriorEntity ropaInterior = repositoryBuscarRopaInterior.findById(id_ropa)
                        .orElseThrow(() -> new EntityNotFoundException("ropa interior no encontrada"));
                venta.setRopaInteriorEntity(ropaInterior);
                break;


            default:
                throw new IllegalArgumentException("Tipo de prenda no soportado");
        }
        return this.repositoryBuscarVentas.save(venta);
    }

    @GetMapping("/ventas")
    public Iterable<VentasEntity> findAllVenyas() {

        return this.repositoryBuscarVentas.findAll();
    }

}