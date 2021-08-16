package Com.company.HospitalController;

import DbConnection.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DrugsController {
    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;


    public static boolean addNewDrug() {

        System.out.println("Enter drug's name: ");
        String drug_name = scanner.nextLine();

        System.out.println("Enter drug's use case or cases: ");
        String drug_use_case = scanner.nextLine();


        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO drugs(drug_name, drug_use_case) VALUES ('" + drug_name + "', '" + drug_use_case + "')");
            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Drugs getDrugsId() {

        System.out.println("Enter the DRUG id: ");
        int id = scanner.nextInt();

        try {
           ps = DbConnection.getConnection().prepareStatement("SELECT  * FROM drugs WHERE id_drugs =" + id);
           rs = ps.executeQuery();


            String drug_name, drug_use_case;

            Drugs drugs = new Drugs();

            while (rs.next()){
                id = rs.getInt("id_drugs");
                drug_name = rs.getString("drug_name");
                drug_use_case = rs.getString("drug_use_case");
                drugs.setId(id);
                drugs.setDrug_name(drug_name);
                drugs.setDrug_use_case(drug_use_case);

                System.out.println("The " + drug_name + " is being used for patients with following diagnoses: " + drug_use_case);

            }

            return drugs;


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

// EDIT DRUG NAME
/*
    public static void editDrugName() {
        System.out.println("Enter the drug's ID: ");
        int id = scanner.nextInt();

        System.out.println("Enter the drugs new name: ");
        String drug_name = scanner.next();


        try {
            ps = DbConnection.getConnection().prepareStatement("UPDATE drugs SET drug_name ="+ drug_name +", drug_use_case = "+ drug_use_case +"+"'" WHERE id_drugs ="' (+ id + )");
            System.out.println("Drugs name and use case is successfully updates.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Drugs name and use case update has failed. Try again.");

        }
    }
*/


    // DELETE DRUG

    public static void deleteDrug(){
        System.out.println("Enter the drug's ID: ");
        int id = scanner.nextInt();

        try {
            ps = DbConnection.getConnection().prepareStatement("DELETE FROM drugs WHERE id_drug  ="+ id +"");
            System.out.println("Drug was successfully deleted from the list.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    }

