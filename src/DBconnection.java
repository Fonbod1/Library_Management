import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static Connection connection;

    // Méthode pour initialiser la connexion
    public static void initialize(String url, String user, String password) throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("connection successful!");
        }
    }

    // Méthode pour obtenir la connexion existante
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            throw new SQLException("No database connection.");
        }
        return connection;
    }

    // Méthode pour fermer la connexion
    public static void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            System.out.println("connection closs !");
        }
    }
}
