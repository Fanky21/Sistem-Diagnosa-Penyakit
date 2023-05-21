import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql_connection {
    private static Connection connection;
    private static final String url = "server url";
    private static final String username = "server username";
    private static final String password = "server password";

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(url, username, password);
                System.out.println("Koneksi berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi gagal!");
                e.printStackTrace();
            }
        }
        return connection;
    }
}