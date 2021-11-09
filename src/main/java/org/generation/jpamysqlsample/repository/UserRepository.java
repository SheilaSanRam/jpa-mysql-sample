package org.generation.jpamysqlsample.repository;

import org.generation.jpamysqlsample.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UserRepository
    //entidad y tipo de dato de la llave primaria
    extends CrudRepository <User, Integer>
{
    //El método busca por nombre
    ArrayList<User> findByName(String name);
}
