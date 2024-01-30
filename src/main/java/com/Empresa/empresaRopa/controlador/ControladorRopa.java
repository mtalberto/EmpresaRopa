package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.Falda;
import com.Empresa.empresaRopa.models.Abrigo;
import com.Empresa.empresaRopa.models.Camiseta;
import com.Empresa.empresaRopa.models.Ropa;
import com.Empresa.empresaRopa.models.RopaInterior;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
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


    @GetMapping("/falda")
    public Iterable<Falda> findAllFaldas() {

        return this.repositoryBuscarFalda.findAll();
    }

    @PostMapping("/falda")
    public Ropa addOneRopa(@RequestBody Falda falda) {
        
        return this.repositoryBuscarFalda.save(falda);
    }

    @GetMapping("/abrigos")
    public Iterable<Abrigo> findAllAbrigos() {

        return this.repositoryBuscarAbrigo.findAll();
    }

    @PostMapping("/abrigos")
    public Ropa addOneRopa(@RequestBody Abrigo abrigo) {
        System.out.println("Recibida abrigo: " + abrigo);
        return this.repositoryBuscarAbrigo.save(abrigo);
    }

    @GetMapping("/camiseta")
    public Iterable<Camiseta> findAllCamisetas() {

        return this.repositoryBuscarCamiseta.findAll();
    }

    @PostMapping("/camiseta")
    public Ropa addOneRopa(@RequestBody Camiseta camiseta) {

        return this.repositoryBuscarCamiseta.save(camiseta);
    }
    @GetMapping("/ropaInterior")
    public Iterable<RopaInterior> findAllRopaInterior() {

        return this.repositoryBuscarRopaInterior.findAll();
    }

    @PostMapping("/ropaInterior")
    public Ropa addOneRopa(@RequestBody RopaInterior ropaInterior) {

        return this.repositoryBuscarRopaInterior.save(ropaInterior);
    }

}
