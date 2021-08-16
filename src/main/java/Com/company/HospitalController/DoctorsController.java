package Com.company.HospitalController;

import DbConnection.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DoctorsController {

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static boolean addNewDoctor(){

        System.out.println("Enter DOCTOR'S FIRST NAME: ");
        String First_name = scanner.nextLine();

        System.out.println("Enter DOCTOR'S LAST NAME: ");
        String Last_name = scanner.nextLine();

        System.out.println("Enter DOCTOR'S SPECIALISATION: ");
        String Specialisation = scanner.next();

        System.out.println("Enter DOCTOR'S PHONE NUMBER: ");
        int Phone = scanner.nextInt();


        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO doctors(First_name, Last_name, Specialisation, Phone) VALUES ('" + First_name + "', '" + Last_name + "', '" + Specialisation + "', " + Phone + ")");
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Doctor getDoctorId(){
        // Ask user to enter the ID of the doctor
        System.out.println("Enter the ID of the doctor: ");
        int id = scanner.nextInt();

        try {
            ps = DbConnection.getConnection().prepareStatement("SELECT * FROM doctors WHERE ID_Doctor =" + id);
            rs = ps.executeQuery();

            int Phone;
            String First_name, Last_Name, Specialisation;

            Doctor doctor = new Doctor();

            while (rs.next()){
                id = rs.getInt("ID_Doctor");
                First_name = rs.getString("First_name");
                Last_Name = rs.getString("Last_Name");
                Specialisation = rs.getString("Specialisation");
                Phone = rs.getInt("Phone");
                doctor.setId(id);
                doctor.setFirst_name(First_name);
                doctor.setLast_Name(Last_Name);
                doctor.setSpecialisation(Specialisation);
                doctor.setPhone(Phone);
                System.out.println("The doctor " + First_name + " " + Last_Name + " is a " + Specialisation + ". If patient has any questions please call the doctor: " + Phone);
                }
            return doctor;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

}
