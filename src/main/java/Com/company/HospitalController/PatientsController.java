package Com.company.HospitalController;

import DbConnection.DbConnection;
import javax.xml.bind.SchemaOutputResolver;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PatientsController {


    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

    public static boolean addNewPatient(){

        System.out.println("Enter the FIRST NAME of the patient: ");
        String First_name = scanner.nextLine();

        System.out.println("Enter the LAST NAME of the patient: ");
        String Second_name = scanner.nextLine();

        System.out.println("Enter the AGE of the patient: ");
        int Age = scanner.nextInt();

        System.out.println("Enter the DIAGNOSE of the patient: ");
        String Diagnose = scanner.next();

        System.out.println("Enter the WARD Nr. of where the patient is: ");
        int Ward_no = scanner.nextInt();




        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO patients(First_name, Second_name, Age, Diagnose, Ward_no) VALUES ('" + First_name + "', '" + Second_name + "', " + Age + ", '" + Diagnose + "', " + Ward_no + ")");
        ps.execute();
        return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Patient getPatientId(){
    // Ask user to enter the ID of the patient
        System.out.print("Enter the ID of the patient: ");
        int id = scanner.nextInt();

        try {
            ps = DbConnection.getConnection().prepareStatement("SELECT  * FROM patients WHERE id =" + id);
            rs = ps.executeQuery();


            int Age, Ward_no;
            String First_name, Second_name, Diagnose;


            Patient patient = new Patient();

            while (rs.next()){
            id = rs.getInt("id");
            First_name = rs.getString("First_name");
            Second_name = rs.getString("Second_name");
            Age = rs.getInt("Age");
            Diagnose = rs.getString("Diagnose");
            Ward_no = rs.getInt("Ward_no");
            patient.setId(id);
            patient.setFirst_name(First_name);
            patient.setSecond_name(Second_name);
            patient.setAge(Age);
            patient.setDiagnose(Diagnose);
            patient.setWard_no(Ward_no);
            System.out.println("The patient is: " + First_name + " " + Second_name + "," + Age + " years old. Paient's diegnose is: " + Diagnose + " Patient is in th ward No,: " + Ward_no);
            }

        return patient;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


    }


}
