package Services;

import Exceptions.AccountException;
import Exceptions.TransactionException;
import Models.Account;
import Models.IdType;
import Models.Operation;
import Models.Transaction;
import Repositories.AccountRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;

public class AccountService {
    private AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }



    public void addAccount(String name, long clientId){
        Account a = new Account(name, clientId);
        try {
            repo.saveAccount(a);
        } catch (SQLException e) {
            throw new AccountException("Error trying to save this new account");
        }
    }


    public List<Account> getAccountsByClientId(long clientId){
        try {
            return repo.getAccountsByClientId(clientId);
        } catch (SQLException e) {
            throw new AccountException("Error trying to access client's accounts");
        }
    }

    public Account getAccountById(long accountId){
        Optional<Account> optionalAccount = null;
        try {
            optionalAccount = repo.getAccountById(accountId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (optionalAccount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "The account couldn't be found");
            throw new TransactionException("The account couldn't be found");
        }

        return optionalAccount.get();
    }

    protected void startTransaction(Transaction t) throws SQLException {

        switch (t.getType()){
            case DEPOSIT -> deposit(t.getOriginAccount(), t.getAmount());
            case WITHDRAW -> withdraw(t.getOriginAccount(), t.getAmount());
            case TRANSFER -> transfer(t.getOriginAccount(), t.getDestinyAccount(), t.getAmount());
        }
    }


    private void deposit(Long account, float amount) throws SQLException {


        repo.modifyBalance(account, amount, Operation.ADD);


    }

    private void withdraw(Long account, float amount) throws SQLException {

        repo.modifyBalance(account, amount, Operation.SUBSTRACT);



    }

    private void transfer(Long originAccount, Long destinyAccount,  float amount) throws SQLException {
        repo.modifyBalance(originAccount, amount, Operation.SUBSTRACT);

        repo.modifyBalance(destinyAccount, amount, Operation.ADD);

    }
}
