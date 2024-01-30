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

    private final RepositoryBuscarRopa repositoryBuscarRopa;


    public ControladorRopa(RepositoryBuscarRopa repositoryBuscarRopa) {
        this.repositoryBuscarRopa = repositoryBuscarRopa;
    }


    @GetMapping("/falda")
    public Iterable<Ropa> findAllFaldas() {

        return this.repositoryBuscarRopa.findAll();
    }

    @PostMapping("/falda")
    public Ropa addOneRopa(@RequestBody Falda falda) {
        
        return this.repositoryBuscarRopa.save(falda);
    }

    @GetMapping("/abrigos")
    public Iterable<Ropa> findAllAbrigos() {

        return this.repositoryBuscarRopa.findAll();
    }

    @PostMapping("/abrigos")
    public Ropa addOneRopa(@RequestBody Abrigo abrigo) {

        return this.repositoryBuscarRopa.save(abrigo);
    }

    @GetMapping("/camiseta")
    public Iterable<Ropa> findAllCamisetas() {

        return this.repositoryBuscarRopa.findAll();
    }

    @PostMapping("/camiseta")
    public Ropa addOneRopa(@RequestBody Camiseta camiseta) {

        return this.repositoryBuscarRopa.save(camiseta);
    }
    @GetMapping("/ropaInterior")
    public Iterable<Ropa> findAllRopaInterior() {

        return this.repositoryBuscarRopa.findAll();
    }

    @PostMapping("/ropaInterior")
    public Ropa addOneRopa(@RequestBody RopaInterior ropaInterior) {

        return this.repositoryBuscarRopa.save(ropaInterior);
    }

}
