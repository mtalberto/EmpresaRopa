package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.controlador.*;
import com.Empresa.empresaRopa.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Service
 * contiene lógica de negocio, operaciones o llamadas complejas a métodos,
 * típicamente haciendo puente entre las operaciones de
 * la base de datos realizadas en la capa de repositorio y las operaciones de la capa de presentación o controlador.
 *
 */
@Service
public class ServicioRopa {

    private final RepositoryBuscarPantalon pantalonRepository;
    private final RepositoryBuscarAbrigo abrigoRepository;

    private final RepositoryBuscarFalda faldaRepository;

    private final RepositoryBuscarCamiseta camisetaRepository;

    private final RepositoryBuscarRopaInterior ropaInteriorRepository;


    /**
     * si tu clase tiene un único constructor, puedes omitir
     * la anotación @Autowired y Spring automáticamente inyectará las dependencias
     * @param pantalonRepository
     */

    @Autowired
    public ServicioRopa(RepositoryBuscarPantalon pantalonRepository, RepositoryBuscarAbrigo abrigoRepository, RepositoryBuscarFalda faldaRepository, RepositoryBuscarCamiseta camisetaRepository, RepositoryBuscarRopaInterior ropaInteriorRepository) {
        this.pantalonRepository = pantalonRepository;
        this.abrigoRepository = abrigoRepository;
        this.faldaRepository = faldaRepository;
        this.camisetaRepository = camisetaRepository;
        this.ropaInteriorRepository = ropaInteriorRepository;
    }

    public PantalonEntity guardarPantalon(PantalonEntity pantalon) {
        return pantalonRepository.save(pantalon);
    }

    public AbrigoEntity guardarAbrigo(AbrigoEntity abrigo){
        return abrigoRepository.save(abrigo);
    }

    public FaldaEntity guardarFalda(FaldaEntity falda){
        return faldaRepository.save(falda);
    }
    public RopaInteriorEntity guardarRopaInterior(RopaInteriorEntity ropaInterior){
        return ropaInteriorRepository.save(ropaInterior);
    }
    public CamisetaEntity guardaCamiseta(CamisetaEntity camiseta){
        return camisetaRepository.save(camiseta);
    }

}
