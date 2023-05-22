package Login_System;
import java.sql.*;

// Check database account status
// Check if database == Account entered
// If yes then login status == yes
// If false then login status == failed

public class Login {
    
    private static String server_url = "";
    private static String username_db = "";
    private static String password_db = "";

    public static void main(String[] args) {
        
        String input_username = "";
        String input_password = "";

    }

    public static void UserLogin(String input_username, String input_password) {

        try {

            Connection connect = DriverManager.getConnection(server_url, username_db, password_db);
            PreparedStatement statement = connect.prepareStatement("SELECT useraccount from Sistem-kesehatan WHERE username = ? AND password = ?"); 
            statement.setString(1, input_username);
            statement.setString(1, input_password);
            ResultSet result = statement.executeQuery();

        } catch (SQLException e) {
            System.out.println("Error");
        }

    }
    
}
