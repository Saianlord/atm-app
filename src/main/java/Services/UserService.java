package Services;

import Models.Account;
import Models.Operation;
import Repositories.UserRepository;

public class UserService {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }



}
