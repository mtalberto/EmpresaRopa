package com.Empresa.EmpresaRopa.controlador;


import com.Empresa.EmpresaRopa.models.Employe;
import com.Empresa.EmpresaRopa.models.Ropa;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ControladorRopa {

    private final RepositoryBuscarRopa repositoryBuscarRopa;


    @GetMapping("/falda")
    public Iterable<Ropa> findAllEmploye() {

        return this.repositoryBuscarRopa.findAll();
    }

    @PostMapping("/falda")
    public Ropa addOneRopa(@RequestBody new Ropa()) {

        return this.repositoryBuscarRopa.save(new Ropa());
    }


}
