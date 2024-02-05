package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.*;
import org.springframework.web.bind.annotation.*;

/**
 *  @RestController [3], implementa una API REST
 *  y se encarga de procesar las peticiones que llegan en los distintos métodos
 *  del protocolo HTML: GET, POST, PUT, DELETE
 */
@RestController
@RequestMapping(value="/Ropa")
public class ControladorRopa {

    private final RepositoryBuscarCamiseta repositoryBuscarCamiseta;
    private final RepositoryBuscarFalda repositoryBuscarFalda;
    private final RepositoryBuscarPantalon repositoryBuscarPantalon;
    private final RepositoryBuscarRopaInterior repositoryBuscarRopaInterior;
    private final RepositoryBuscarAbrigo repositoryBuscarAbrigo;


    public ControladorRopa(RepositoryBuscarFalda repositoryBuscarFalda, RepositoryBuscarCamiseta repositoryBuscarCamiseta, RepositoryBuscarPantalon repositoryBuscarPantalon, RepositoryBuscarAbrigo repositoryBuscarAbrigo,RepositoryBuscarRopaInterior repositoryBuscarRopaInterior) {
        this.repositoryBuscarFalda = repositoryBuscarFalda;
        this.repositoryBuscarRopaInterior = repositoryBuscarRopaInterior;
        this.repositoryBuscarPantalon = repositoryBuscarPantalon;
        this.repositoryBuscarAbrigo=repositoryBuscarAbrigo;
        this.repositoryBuscarCamiseta=repositoryBuscarCamiseta;

    }


    @GetMapping("/faldas")
    public Iterable<FaldaEntity> findAllFaldas() {

        return this.repositoryBuscarFalda.findAll();
    }

    @PostMapping("/faldas")
    public Ropa addOneRopa(@RequestBody FaldaEntity faldaEntity) {
        
        return this.repositoryBuscarFalda.save(faldaEntity);
    }

    @GetMapping("/abrigos")
    public Iterable<AbrigoEntity> findAllAbrigos() {

        return this.repositoryBuscarAbrigo.findAll();
    }

    @PostMapping("/abrigos")
    public Ropa addOneRopa(@RequestBody AbrigoEntity abrigoEntity) {
        System.out.println("Recibida abrigo: " + abrigoEntity);
        return this.repositoryBuscarAbrigo.save(abrigoEntity);
    }

    @GetMapping("/camisetas")
    public Iterable<CamisetaEntity> findAllCamisetas() {

        return this.repositoryBuscarCamiseta.findAll();
    }

    @PostMapping("/camisetas")
    public Ropa addOneRopa(@RequestBody CamisetaEntity camisetaEntity) {

        return this.repositoryBuscarCamiseta.save(camisetaEntity);
    }
    @GetMapping("/ropaInterior")
    public Iterable<RopaInteriorEntity> findAllRopaInterior() {

        return this.repositoryBuscarRopaInterior.findAll();
    }

    @PostMapping("/ropaInterior")
    public Ropa addOneRopa(@RequestBody RopaInteriorEntity ropaInteriorEntity) {

        return this.repositoryBuscarRopaInterior.save(ropaInteriorEntity);
    }


    @GetMapping("/pantalones")
    public Iterable<PantalonEntity> findAllPantalones() {

        return this.repositoryBuscarPantalon.findAll();
    }

    @PostMapping("/pantalones")
    public Ropa addOneRopa(@RequestBody PantalonEntity pantalonEntity) {

        return this.repositoryBuscarPantalon.save(pantalonEntity);
    }


}
