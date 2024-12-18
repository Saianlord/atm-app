package Repositories;

import Models.Transaction;
import Models.TransactionType;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;

import java.util.Optional;

public class TransactionRepository {
    private Connection conn;


    public TransactionRepository( Connection conn ) {
        this.conn = conn;
    }

    public void saveTransaction(Transaction transaction) throws SQLException {
        String sql = "INSERT INTO transactions (transaction_type, description, origin_account, destiny_account, amount, transaction_date) VALUES (?, ?, ?, ?, ?, ?)";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, transaction.getType().toString());
            preparedStatement.setString(2, transaction.getDescription());
            preparedStatement.setLong(3, transaction.getOriginAccount());
            preparedStatement.setLong(4, transaction.getDestinyAccount());
            preparedStatement.setFloat(5, transaction.getAmount());
            preparedStatement.setDate(6, Date.valueOf(transaction.getDate()));

            preparedStatement.executeUpdate();
        }
    }


    public Optional<Transaction> getTransactionById(long id) throws SQLException {

        String sql = "SELECT * FROM transactions WHERE id = ?";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setLong(1, id);

            try(ResultSet rs = preparedStatement.executeQuery()){
                return Optional.of(createTransaction(rs));
            }
        }
    }




    private Transaction createTransaction(ResultSet rs) throws SQLException {
        Transaction t = new Transaction();
        t.setId(rs.getLong("id"));
        t.setType(TransactionType.valueOf(rs.getString("transaction_type")));
        t.setDescription(rs.getString("description"));
        t.setOriginAccount(rs.getLong("origin_account"));
        t.setDestinyAccount(rs.getLong("destiny_account"));
        t.setAmount(rs.getFloat("amount"));
        t.setDate(LocalDate.parse(rs.getDate("transaction_date").toString()));

        return t;

    }

}
