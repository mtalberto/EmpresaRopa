package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.*;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Controlador REST
@RestController

public class ControladorVentas {
    @Autowired
    private final RepositoryCompras repositoryCompras;
    @Autowired
    private final RepositoryUsuarios repositoryUsuarios;
    @Autowired
    private final RepositoryAbrigo repositoryAbrigo;
    @Autowired
    private final RepositorCamiseta repositorCamiseta;
    @Autowired
    private final RepositoryRopaInterior repositoryRopaInterior;
    @Autowired
    private final RepositoryPantalon repositoryPantalon;
    @Autowired
    private final RepositoryFalda repositoryFalda;




    public ControladorVentas(RepositoryCompras repositoryCompras, RepositoryUsuarios repositoryUsuarios, RepositoryAbrigo repositoryAbrigo, RepositorCamiseta repositorCamiseta, RepositoryRopaInterior repositoryRopaInterior, RepositoryPantalon repositoryPantalon, RepositoryFalda repositoryFalda) {
        this.repositoryCompras = repositoryCompras;
        this.repositoryUsuarios = repositoryUsuarios;
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
     *
     * @param venta
     * @param idEmpleado
     * @param idRopa
     * @param tiporopa
     * @return
     * @throws Throwable
     */
    @PostMapping("/ventas")

    public ComprasEntity addOneVenta(@RequestBody ComprasEntity venta, @RequestParam Long idEmpleado,
                                     @RequestParam Long idRopa,
                                     @RequestParam String tiporopa) throws Throwable {
        UsuarioEntity empleado = repositoryUsuarios.findById(idEmpleado)
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

            default:
                throw new IllegalArgumentException("Tipo de prenda no soportado");
        }
        return this.repositoryCompras.save(venta);
    }

    @GetMapping("/ventas")
    /**
     * @return ventas
     */
    @Transactional
    public Iterable<ComprasEntity> findAllVentas() {

        return this.repositoryCompras.findAll();
    }



}