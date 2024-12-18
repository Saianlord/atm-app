package Util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    private String url = "jdbc:mysql://localhost:3306/atm_app";
    private String user = "root";
    private String password = "Pass123";
    private Connection connection;


    public SQLConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa con la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
            throw new RuntimeException("No se pudo establecer la conexión con la base de datos.", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }


}
