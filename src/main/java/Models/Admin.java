package Models;

public class Admin extends User{

    public Admin(String nationalId, int pin) {
        super(nationalId, pin, false);
    }

}
