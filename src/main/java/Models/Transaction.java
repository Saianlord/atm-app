package Models;

import Services.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Transaction {
    private Long id;
    private TransactionType type;
    private String description;
    private Account origin;
    private Account destiny;
    private float amount;
    private LocalDate date;

    public Transaction(TransactionType type, String description, Account origin, Account destiny, float amount) {
        this.type = type;
        this.description = description;
        this.origin = origin;
        this.destiny = destiny;
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public TransactionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Account getOrigin() {
        return origin;
    }

    public Account getDestiny() {
        return destiny;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id);
    }
}
