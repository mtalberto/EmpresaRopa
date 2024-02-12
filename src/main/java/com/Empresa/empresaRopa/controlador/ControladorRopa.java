package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.RepositorCamiseta;
import com.Empresa.empresaRopa.repository.RepositoryAbrigo;
import com.Empresa.empresaRopa.repository.RepositoryFalda;
import com.Empresa.empresaRopa.repository.RepositoryPantalon;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    private final RepositoryAbrigo repositoryAbrigo;


    public ControladorRopa(RepositoryFalda repositoryFalda, RepositorCamiseta repositorCamiseta, RepositoryPantalon repositoryPantalon, RepositoryAbrigo repositoryAbrigo) {
        this.repositoryFalda = repositoryFalda;
        this.repositoryPantalon = repositoryPantalon;
        this.repositoryAbrigo = repositoryAbrigo;
        this.repositorCamiseta = repositorCamiseta;

    }


    @GetMapping("/ListaFaldas")

    public List<FaldaEntity> findAllFaldas() {

        return (List<FaldaEntity>) this.repositoryFalda.findAll();
    }

    @PostMapping("/AñadirFaldas")
    public Ropa addOneRopa(@RequestBody FaldaEntity faldaEntity) {
        
        return this.repositoryFalda.save(faldaEntity);
    }

    @GetMapping("/ListaAbrigos")

    public Iterable<AbrigoEntity> findAllAbrigos() {

        return this.repositoryAbrigo.findAll();
    }

    @PostMapping("/AñadirAbrigo")
    public Ropa addOneRopa(@RequestBody AbrigoEntity abrigoEntity) {
        System.out.println("Recibida abrigo: " + abrigoEntity);
        return  this.repositoryAbrigo.save(abrigoEntity);
    }

    @GetMapping("/ListaCamisetas")

    public Iterable<CamisetaEntity> findAllCamisetas() {

        return  this.repositorCamiseta.findAll();
    }

    @PostMapping("/AñadirCamisetas")
    public Ropa addOneRopa(@RequestBody CamisetaEntity camisetaEntity) {

        return  this.repositorCamiseta.save(camisetaEntity);
    }



    @GetMapping("/ListaPantalones")

    public Iterable<PantalonEntity> findAllPantalones() {

        return this.repositoryPantalon.findAll();
    }

    @PostMapping("/AñadirPantalones")
    public Ropa addOneRopa(@RequestBody PantalonEntity pantalonEntity) {

        return  this.repositoryPantalon.save(pantalonEntity);
    }


}
