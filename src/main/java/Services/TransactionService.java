package Services;

import Exceptions.TransactionException;
import Models.IdType;
import Models.Transaction;
import Models.TransactionType;
import Repositories.TransactionRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;
import javax.swing.JOptionPane;

public class TransactionService {
    private final TransactionRepository repo;
    private final AccountService accountService;

    public TransactionService(TransactionRepository repo, AccountService accountService) {
        this.repo = repo;
        this.accountService = accountService;
    }

    public Transaction addTransaction(TransactionType type, String description, Long origin, Long destiny, float amount){

        Transaction t = new Transaction(type, description, origin, destiny, amount);

        try {
            accountService.startTransaction(t);
            saveTransaction(t);
            return t;

        } catch (SQLException e) {

            throw new TransactionException("The operation has failed. Changes weren't saved in the data base.");
        }

    }


    public Transaction getTransactionById(long transactonId){
        Optional<Transaction> optionalTransaction = null;
        try {
            optionalTransaction = repo.getTransactionById(transactonId);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (optionalTransaction.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The transaction couldn't be found");
            throw new TransactionException("The transaction couldn't be found");
        }

        return optionalTransaction.get();
    }


    private  void saveTransaction(Transaction transaction){
        try {
            repo.saveTransaction(transaction);

        } catch (SQLException e) {

            throw new TransactionException("The transaction was processed, but the changes couldn't be saved");
        }
    }
}
