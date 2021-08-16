package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection getConnection(){

        Connection connection = null;

        try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "ABC123");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
