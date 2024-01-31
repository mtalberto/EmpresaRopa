package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.models.FaldaEntity;
import com.Empresa.empresaRopa.models.AbrigoEntity;
import com.Empresa.empresaRopa.models.CamisetaEntity;
import com.Empresa.empresaRopa.models.Ropa;
import com.Empresa.empresaRopa.models.RopaInteriorEntity;
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
    public Iterable<FaldaEntity> findAllFaldas() {

        return this.repositoryBuscarFalda.findAll();
    }

    @PostMapping("/falda")
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

    @GetMapping("/camiseta")
    public Iterable<CamisetaEntity> findAllCamisetas() {

        return this.repositoryBuscarCamiseta.findAll();
    }

    @PostMapping("/camiseta")
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

}
