package com.Empresa.empresaRopa.controlador;

import com.Empresa.empresaRopa.entitys.*;
import com.Empresa.empresaRopa.repository.*;
import jakarta.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.*;




//Arquitectura expone los endpoints(rutas)
//Controlador REST
@RestController
public class ControladorCompras {
//no pongo autowired por que ahora lo hace desde el contructor
    private final RepositoryCompras repositoryCompras;

    private final RepositoryUsuarios repositoryUsuarios;

    private final RepositoryAbrigo repositoryAbrigo;

    private final RepositorCamiseta repositorCamiseta;



    private final RepositoryPantalon repositoryPantalon;

    private final RepositoryFalda repositoryFalda;




    public ControladorCompras(RepositoryCompras repositoryCompras, RepositoryUsuarios repositoryUsuarios, RepositoryAbrigo repositoryAbrigo, RepositorCamiseta repositorCamiseta, RepositoryPantalon repositoryPantalon, RepositoryFalda repositoryFalda) {
        this.repositoryCompras = repositoryCompras;
        this.repositoryUsuarios = repositoryUsuarios;
        this.repositoryAbrigo = repositoryAbrigo;
        this.repositorCamiseta = repositorCamiseta;

        this.repositoryPantalon = repositoryPantalon;
        this.repositoryFalda = repositoryFalda;


    }
//@RequestBody) se espera que sea un objeto Ventas, que se guarda en la base de datos.
    //debees recibir el id del empleado como parametro de la consulta

    /**
     * Boolean confirmar: Captura un parámetro de consulta opcional llamado confirmar. Si el parámetro
     * no está presente en la solicitud, por defecto se asigna el valor false.
     *Metodos http post,get,put,delete
     * @param venta
     * @param idEmpleado
     * @param idRopa
     * @param tiporopa
     * @return
     * @throws Throwable
     */

    /**
     * @ResponseBody es una anotación en Spring que se utiliza para indicar que el valor de retorno de un método de controlador debe ser enlazado al cuerpo de la respuesta web. Esto significa que Spring convertirá automáticamente el valor de retorno del método en formato JSON o
     * XML (u otro formato de respuesta personalizado)
     * @param venta
     * @param idUsuario
     * @param idRopa
     * @param tiporopa
     * @return
     * @throws Throwable
     */
    @SuppressWarnings("null")
    @ResponseBody
    @Transactional
    @PostMapping("/Compras/{idUsuario}/{idRopa}/{tiporopa}")
    public ComprasEntity addOneCompra(@RequestBody ComprasEntity venta, @PathVariable Long idUsuario,
                                      @PathVariable Long idRopa,
                                      @PathVariable String tiporopa) throws Throwable {
        UsuarioEntity usuario = repositoryUsuarios.findById(idUsuario)
                .orElseThrow(() -> new EntityNotFoundException("Empleado no encontrado"));
        venta.setUsuario(usuario );

        switch (tiporopa.toLowerCase()) {
            case "abrigo":
                AbrigoEntity abrigo = repositoryAbrigo.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("abrigo no encontrada"));
                venta.setAbrigo(abrigo);
                break;
            case "falda":
                FaldaEntity falda = repositoryFalda.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("Falda no encontrada"));
                venta.setFalda(falda);
                break;
            case "camiseta":
                CamisetaEntity camiseta = repositorCamiseta.findById(idRopa)
                        .orElseThrow(() -> new EntityNotFoundException("Camiseta no encontrada"));
                venta.setCamiseta(camiseta);
                break;

            case "pantalon":
                PantalonEntity pantalon = null;
                try {
                    pantalon = repositoryPantalon.findById(idRopa)
                            .orElseThrow(() -> new EntityNotFoundException("pantalon no encontrado"));
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
                venta.setPantalon(pantalon);
                break;

            default:
                throw new IllegalArgumentException("Tipo de prenda no soportado");
        }
        return this.repositoryCompras.save(venta);
    }




}