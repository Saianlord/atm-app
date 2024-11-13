package Repositories;

import Util.ConnectionDb;

public class TransactionRepository {
    private ConnectionDb conn;

    public TransactionRepository(ConnectionDb conn) {
        this.conn = conn;
    }

    public void saveTransaction(){
        //Implementación de como se guarda la transacción en la base de datos o archivo
    }
}
