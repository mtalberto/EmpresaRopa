package com.Empresa.empresaRopa.controlador;


import com.Empresa.empresaRopa.models.Ropa;
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
    public Ropa addOneRopa(@RequestBody Ropa ropa) {
        
        return this.repositoryBuscarRopa.save(ropa);
    }


}
