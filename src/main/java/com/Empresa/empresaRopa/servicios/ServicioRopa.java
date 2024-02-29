package com.Empresa.empresaRopa.servicios;


import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.RepositorCamiseta;
import com.Empresa.empresaRopa.repository.RepositoryAbrigo;
import com.Empresa.empresaRopa.repository.RepositoryFalda;
import com.Empresa.empresaRopa.repository.RepositoryPantalon;
import org.springframework.stereotype.Service;

import java.util.List;

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


    /**
     * si tu clase tiene un único constructor, puedes omitir
     * la anotación @Autowired y Spring automáticamente inyectará las dependencias
     *
     * @param pantalonRepository
     */

   
    public ServicioRopa(RepositoryPantalon pantalonRepository, RepositoryAbrigo abrigoRepository, RepositoryFalda faldaRepository, RepositorCamiseta camisetaRepository) {
        this.pantalonRepository = pantalonRepository;
        this.abrigoRepository = abrigoRepository;
        this.faldaRepository = faldaRepository;
        this.camisetaRepository = camisetaRepository;

    }


    /**
     * solo me interesa mostrar la lista en la vista usuario
     * donde saldra la lista de sus compras para no cargar la bd
     * guardo la ropa sin lista de compras
     *
     * @param ropa
     * @return
     */
    public Ropa guardarRopa(Ropa ropa) {
        switch (ropa.getTiporopa().toLowerCase()) {
            case "abrigo":
                return abrigoRepository.save((AbrigoEntity) ropa);
            case "camiseta":
                return camisetaRepository.save((CamisetaEntity) ropa);
            case "falda":
                return faldaRepository.save((FaldaEntity) ropa);
            case "pantalon":
                return pantalonRepository.save((PantalonEntity) ropa);
            default:
                throw new IllegalArgumentException("No me has indicado adecuadamente el tipo de ropa " + ropa.getTiporopa());
        }

    }
}