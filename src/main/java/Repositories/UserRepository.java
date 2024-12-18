package Repositories;

import Models.User;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {
    private Connection conn;


    public UserRepository( Connection conn ) {
        this.conn = conn;
    }

    public void saveUser(User user) throws SQLException {
        String sql = user.getId() > 0 ? "UPDATE users SET national_id = ?, name = ?, pin = ?, WHERE id = ?" :
                "INSERT INTO users (national_id, name, pin) VALUES (?, ?, ?)";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, user.getNationalId());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPin());
            if(user.getId() > 0){
                preparedStatement.setLong(4, user.getId());
            }

            preparedStatement.executeUpdate();
        }
    }

    public User getUserById(Long userId) throws SQLException {

        String sql = "SELECT * FROM users WHERE id = ?";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setLong(1, userId);

            try(ResultSet rs = preparedStatement.executeQuery()){
                return createUser(rs);
            }
        }
    }

    public User getUserByUser(String userName) throws SQLException {
        String sql = "SELECT * FROM users WHERE name = ?";

        try(PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, userName);

            try(ResultSet rs = preparedStatement.executeQuery()){
                return createUser(rs);
            }
        }
    }



    private User createUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setNationalId(rs.getString("national_id"));
        user.setPin(rs.getString("pin"));
        return user;
    }
}

