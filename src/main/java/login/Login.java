package login;

import DbConnection.DbConnection;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.xml.bind.SchemaOutputResolver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;


    public static boolean signup(){
        System.out.println("Enter your username: ");
        String username = scanner.next().trim();

        System.out.println("Enter your password: ");
        String password = scanner.next().trim();

        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO users(username,password)" +
                    "VALUES('" + username + "', '" + password + "')");
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Something went wrong - this username already exists. Try another user name.");
            return false;
           }

    }

    public static boolean login(){
        System.out.println("Enter your username: ");
        String username = scanner.next().trim();

        System.out.println("Enter your password: ");
        String password = scanner.next().trim();

        try {
            ps = DbConnection.getConnection().prepareStatement("SELECT * FROM users " +
                    "WHERE username = '" + username + "' AND password = '" + password + "'" );

            rs = ps.executeQuery();

            String passwordCheck = "";
            while (rs.next()){
                passwordCheck = rs.getString("password");
            }
            return passwordCheck.equals(password);

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Unable to login.");
            return false;
        }
    }
}
