package models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OperacionBuscarEmpleados extends CrudRepository<Employe, Long> {

    List<Employe> findBySegundoApellido(String segundoApellido);


}
