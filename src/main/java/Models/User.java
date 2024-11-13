package Models;

import Exceptions.UserExceptions;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private Long id;
    private String nationalId;
    private int pin;
    private List<Account> accounts;

    /*
    El tipo de usuario Admin no puede tener cuentas, ya que este tipo de usuario es usado solo para
    gestionar ciertas cosas a las que los clientes no pueden acceder.

     */

    public User(String nationalId, int pin, boolean isClient ) {
        this.nationalId = nationalId;
        this.pin = pin;
        this.accounts = isClient ? new ArrayList<>() : null;
    }

    public Long getId() {
        return id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public List<Account> getAccounts() {
        if (this.accounts == null) {
            throw new UserExceptions("This type of user doesn't have accounts");
        }
        return this.accounts;
    }

    public void addAccount(Account account) {
        if (this.accounts == null) {
            throw new UserExceptions("This type of user can't have accounts");
        }
        this.accounts.add(account);
    }


}
