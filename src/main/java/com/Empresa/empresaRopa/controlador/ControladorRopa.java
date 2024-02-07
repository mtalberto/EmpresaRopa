package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.*;
import org.springframework.web.bind.annotation.*;

/**
 *  @RestController [3], implementa una API REST
 *  y se encarga de procesar las peticiones que llegan en los distintos métodos
 *  del protocolo HTML: GET, POST, PUT, DELETE
 */
@RestController
@RequestMapping(value="/Ropa")
public class ControladorRopa {

    private final RepositorCamiseta repositorCamiseta;
    private final RepositoryFalda repositoryFalda;
    private final RepositoryPantalon repositoryPantalon;
    private final RepositoryRopaInterior repositoryRopaInterior;
    private final RepositoryAbrigo repositoryAbrigo;


    public ControladorRopa(RepositoryFalda repositoryFalda, RepositorCamiseta repositorCamiseta, RepositoryPantalon repositoryPantalon, RepositoryAbrigo repositoryAbrigo, RepositoryRopaInterior repositoryRopaInterior) {
        this.repositoryFalda = repositoryFalda;
        this.repositoryRopaInterior = repositoryRopaInterior;
        this.repositoryPantalon = repositoryPantalon;
        this.repositoryAbrigo = repositoryAbrigo;
        this.repositorCamiseta = repositorCamiseta;

    }


    @GetMapping("faldas")
    public Iterable<FaldaEntity> findAllFaldas() {

        return this.repositoryFalda.findAll();
    }

    @PostMapping("faldas")
    public Ropa addOneRopa(@RequestBody FaldaEntity faldaEntity) {
        
        return this.repositoryFalda.save(faldaEntity);
    }

    @GetMapping("abrigos")
    public Iterable<AbrigoEntity> findAllAbrigos() {

        return this.repositoryAbrigo.findAll();
    }

    @PostMapping("abrigos")
    public Ropa addOneRopa(@RequestBody AbrigoEntity abrigoEntity) {
        System.out.println("Recibida abrigo: " + abrigoEntity);
        return  this.repositoryAbrigo.save(abrigoEntity);
    }

    @GetMapping("camisetas")
    public Iterable<CamisetaEntity> findAllCamisetas() {

        return  this.repositorCamiseta.findAll();
    }

    @PostMapping("camisetas")
    public Ropa addOneRopa(@RequestBody CamisetaEntity camisetaEntity) {

        return  this.repositorCamiseta.save(camisetaEntity);
    }
    @GetMapping("ropaInterior")
    public Iterable<RopaInteriorEntity> findAllRopaInterior() {

        return this.repositoryRopaInterior.findAll();
    }

    @PostMapping("ropaInterior")
    public Ropa addOneRopa(@RequestBody RopaInteriorEntity ropaInteriorEntity) {

        return  this.repositoryRopaInterior.save(ropaInteriorEntity);
    }


    @GetMapping("pantalones")
    public Iterable<PantalonEntity> findAllPantalones() {

        return this.repositoryPantalon.findAll();
    }

    @PostMapping("pantalones")
    public Ropa addOneRopa(@RequestBody PantalonEntity pantalonEntity) {

        return  this.repositoryPantalon.save(pantalonEntity);
    }


}
