package Repositories;

import Util.UsersFile;

import java.io.File;

public class UserRepository {

    private UsersFile usersFile = UsersFile.getInstance();

    private File file = usersFile.getFile();

    public UserRepository() {

    }



}
