package Repositories;

import Exceptions.TransactionException;
import Models.Account;
import Models.Operation;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountRepository {

    private Connection conn;


    public AccountRepository( Connection conn ) {
        this.conn = conn;
    }

    public void saveAccount(Account account) throws SQLException {
        String sql = account.getId() > 0 ? "UPDATE accounts SET name = ?, balance = ?, WHERE id = ?" :
                "INSERT INTO accounts (name, client_id, balance) VALUES (?, ?, ?)";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, account.getName());
            if(account.getId() > 0){
                preparedStatement.setFloat(2, account.getBalance());
                preparedStatement.setLong(3, account.getId());
            }else {
                preparedStatement.setLong(2, account.getClientId());
                preparedStatement.setFloat(3, account.getBalance());
            }

            preparedStatement.executeUpdate();
        }
    }


    public List<Account> getAccountsByClientId(long clientId) throws SQLException {
        List<Account> clientAccounts = new ArrayList<>();

        String sql = "SELECT * FROM accounts WHERE client_id = ?";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setLong(1, clientId);

            try(ResultSet rs = preparedStatement.executeQuery()){
                while (rs.next()){
                    clientAccounts.add(createAccount(rs));
                }
            }
        }

        return clientAccounts;
    }

    public Optional<Account> getAccountById(long accountId) throws SQLException {

        String sql = "SELECT * FROM accounts WHERE id = ?";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setLong(1, accountId);

            try(ResultSet rs = preparedStatement.executeQuery()){
               return Optional.of(createAccount(rs));
            }
        }
    }


    private Account createAccount(ResultSet rs) throws SQLException {
        Account a = new Account();
        a.setId(rs.getLong("id"));
        a.setClientId(rs.getLong("client_id"));
        a.setName(rs.getString("name"));
        a.setBalance(rs.getFloat("balance"));

        return a;
    }



    public void modifyBalance(Long accountId, float amount, Operation operation) throws SQLException {
        Optional<Account> optionalAccount = getAccountById(accountId);

        if (optionalAccount.isEmpty()) {
            throw new TransactionException("The operation wasn't processed because the account couldn't be accessed.");
        }

        Account account = optionalAccount.get();

        switch (operation) {
            case ADD -> account.setBalance(account.getBalance() + amount);
            case SUBSTRACT -> {
                if(account.getBalance() < amount){
                    JOptionPane.showMessageDialog(null, "The transaction failed due to Insuficcient funds");
                    throw new TransactionException("The transaction failed due to Insuficcient funds");
                }
                account.setBalance(account.getBalance() - amount);
            }
        }

        saveAccount(account);
    }

}