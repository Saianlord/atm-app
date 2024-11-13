package Models;

import Exceptions.TransactionException;
import Services.UserService;

import java.util.List;
import java.util.Objects;

public class Account {
    private Long id;
    private String name;
    private float balance;
    private List<Transaction> transactions;

    public Account(String name) {
        this.name = name;
        this.balance = 0.0f;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return name;
    }

    public void setDescription(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        //Se reconstruye directamente de la base de datos, por lo tanto las excepciones se manejan ahí
        this.transactions.add(transaction);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id);
    }

}
