package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.*;
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

    private final RepositoryPantalon pantalonRepository;
    private final RepositoryAbrigo abrigoRepository;

    private final RepositoryFalda faldaRepository;

    private final RepositorCamiseta camisetaRepository;

    private final RepositoryRopaInterior ropaInteriorRepository;


    /**
     * si tu clase tiene un único constructor, puedes omitir
     * la anotación @Autowired y Spring automáticamente inyectará las dependencias
     * @param pantalonRepository
     */

    @Autowired
    public ServicioRopa(RepositoryPantalon pantalonRepository, RepositoryAbrigo abrigoRepository, RepositoryFalda faldaRepository, RepositorCamiseta camisetaRepository, RepositoryRopaInterior ropaInteriorRepository) {
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
