package Services;

import Models.Account;
import Models.Operation;
import Models.Transaction;
import Models.TransactionType;
import Repositories.AccountRepository;

public class AccountService {
    private AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }

    public void startTransaction(Transaction t){
        //Este método requiere siempre de dos cuentas. Cuando configuren la interfaz gráfica y lo ocupen llamar para hacer un depósito o retiro
        //Solo pongan la cuenta destiny en null y el tipo correcto de solicitud

        switch (t.getType()){
            case DEPOSIT -> deposit(t.getOrigin(), t.getAmount());
            case WITHDRAW -> withdraw(t.getOrigin(), t.getAmount());
            case TRANSFER -> transfer(t.getOrigin(), t.getDestiny(), t.getAmount());
        }
    }


    private void deposit(Account account, float amount){
        //Se llama al metodo de modificar balance del repositorio. Este metodo recibe una cuenta a la que se le modificara el balance,
        //El monto que se agregará o quitará, y el tipo de operación ADD para sumar y Substract para substraer

        repo.modifyBalance(account, amount, Operation.ADD);

        //Este método tiene que implementarse al igual que el método del repositorio

    }

    private void withdraw(Account account, float amount){
        //Se llama al metodo de modificar balance del repositorio. Este metodo recibe una cuenta a la que se le modificara el balance,
        //El monto que se agregará o quitará, y el tipo de operación ADD para sumar y Substract para substraer

        repo.modifyBalance(account, amount, Operation.SUBSTRACT);

        //Este método tiene que implementarse al igual que el método del repositorio

    }

    private void transfer(Account origin, Account destiny,  float amount){
        //En el método transfer se substrae el monto a la cuenta origen y se agrega a la cuenta destino
        repo.modifyBalance(origin, amount, Operation.SUBSTRACT);

        repo.modifyBalance(origin, amount, Operation.ADD);

        //Este método tiene que implementarse al igual que el método del repositorio


    }
}
