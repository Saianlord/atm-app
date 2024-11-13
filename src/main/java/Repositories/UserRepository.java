package Repositories;

import Models.Account;
import Models.Operation;
import Util.ConnectionDb;

public class UserRepository {
    private ConnectionDb conn;

    public UserRepository(ConnectionDb conn) {
        this.conn = conn;
    }

    /*
    UserRepository se conecta ya sea a la base de datos o al file usando una conexión que se configura en el Packaga Util, en el archivo ConnectionDb.

    UserRepository implementa los métodos CRUD para interactuar con los registros que tengamos, y UserService implementa la lógica de negocio para el CRUD
     */


}
