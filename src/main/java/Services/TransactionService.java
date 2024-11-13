package Services;

import Models.Account;
import Models.Transaction;
import Models.TransactionType;
import Repositories.TransactionRepository;

public class TransactionService {
    private final TransactionRepository repo;
    private final AccountService accountService;

    public TransactionService(TransactionRepository repo, AccountService accountService) {
        this.repo = repo;
        this.accountService = accountService;
    }

    public void addTransaction(TransactionType type, String description, Account origin, Account destiny, float amount){

        Transaction t = new Transaction(type, description, origin, destiny, amount);

        accountService.startTransaction(t);

        /*
        Aqui hay que manejar una posible excepción que puede ser lanzada desde el repositorio de cuenta.
        Si el repositorio de cuenta no puede accceder a la base de datos o archivo para modificar el balance, tenemos que lanzar la excepción desde el
        repositorio de cuenta al servicio de cuenta, y posteriormente lanzarla a este servicio. finalmente aquí la manejamos con un try-catch.
        Basicamente si no hay excepcion, registramos la transaccion en la base de datos usando el repositorio de transacciones, pero si hay una excepción,
        mostramos un error y no registramos la transacción ya que sería mentira que la operación se llevó a cabo
         */

        persistTransaction();
        /*
        Si todo sale bien se llama a este método privado para que guarde la transacción, pero recordemos que este método no la guarda, sino que llama
        al método del repositorio que guarda la transacción. El método del repositorio también puede lanzar una excepción que tendriamos que controlar aquí,
        si no logra guardar o persistir la transaccion
         */
    }

    private  void persistTransaction(){
        //Este método tiene que implementarse al igual que el método del repositorio

        repo.saveTransaction();
    }
}
