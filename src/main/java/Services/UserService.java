package Services;

import Models.Account;
import Models.Operation;
import Repositories.UserRepository;

public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }


    /*
    La clase UserService utiliza los métodos de la clase UserRepository, que serían para Crear, Leer, Modificar y eliminar de la base de datos.

    La diferencia es que la lógica del negocio se agrega aquí. Por ejemplo, en la clase repository podemos tener un método para leer todos los usuarios,
    y en la clase service llamamos ese método, pero límitamos los resultados solo a los clientes activos.
     */


}
