package Models;

import java.util.ArrayList;
import java.util.List;

public class Client extends User{


    public Client(String nationalId, int pin) {
        super(nationalId, pin, true);
    }

}
