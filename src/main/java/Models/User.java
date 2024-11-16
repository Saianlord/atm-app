package Models;

import Exceptions.UserExceptions;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String nationalId;
    private String name;
    private String lastName;
    private String pin;

    /*
    El tipo de usuario Admin no puede tener cuentas, ya que este tipo de usuario es usado solo para
    gestionar ciertas cosas a las que los clientes no pueden acceder.

     */
    public User(){
        
    }
    public User(String nationalId, String name, String lastName, String pin) {
        this.nationalId = nationalId;
        this.name = name;
        this.lastName = lastName;
        this.pin = pin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }


    @Override
    public String toString() {
        return id + "|" + nationalId + "|" + name + "|" + lastName + "|" + pin;
    }


}
