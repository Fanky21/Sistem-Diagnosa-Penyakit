import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        Connection connection = mysql_connection.getConnection();

        try {
            System.out.println("Koneksi berhasil!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        }

    }
}
