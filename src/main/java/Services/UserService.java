package Services;

import Repositories.UserRepository;
import Models.User;

import java.sql.SQLException;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
  
    public boolean login(String userName, String pin) {
        User user = null;
        try {
            user = userRepository.getUserByUser(userName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(userName);
        System.out.println(pin);
        return user != null && user.getPin().equals(pin);
    }
    

   
    public boolean createUser(Long userId, String name, String idNumber, String pin) {
        User user = new User();
        user.setId(userId);
        user.setName(name);
        user.setNationalId(idNumber);
        user.setPin(pin);

        try {
            userRepository.saveUser(user);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}
