package Services;

import Models.Account;
import Models.Operation;
import Repositories.UserRepository;
import Models.User;

public class UserService {

    private final UserRepository userRepository = new UserRepository();

  
    public boolean login(String idNumber, String pin) {
        User user = userRepository.getUserById(idNumber);
        return user != null && user.getPin().equals(pin);
    }

   
    public boolean createUser(String userId, String name, String idNumber, String pin) {
        User user = new User();
        user.setId(userId);
        user.setName(name);
        user.setNationalId(idNumber);
        user.setPin(pin);
        return userRepository.createUserInFile(user);
    }

}
