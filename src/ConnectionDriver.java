import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDriver {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/mark";
            String username = "root";
            String password = "root";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                System.out.println("Connection to Store DB succesfull!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");

        }
    }
}
