import Com.company.HospitalController.DoctorsController;
import Com.company.HospitalController.DrugsController;
import Com.company.HospitalController.PatientsController;
import login.Login;

public class Main {
    public static void main(String[] args) {


// LOGIN
System.out.println(Login.signup() ? "Your sign up is sucessful!" : Login.signup());


// PATIENTS
//  System.out.println(PatientsController.addNewPatient() ? "New patient is successfully added to the list" : "Failed to add new patient. Please try again.");
//  PatientsController.getPatientId();


// DOCTORS
//    System.out.println(DoctorsController.addNewDoctor() ? "New doctor is successfully added to the list" : "Failed to add new doctor. Please try again.");
//    DoctorsController.getDoctorId();

// DRUGS
//  System.out.println(DrugsController.addNewDrug() ? "New drug is successfully added to the list" : "Failed to add new drug. Please try again.");
//  DrugsController.getDrugsId();
 //               DrugsController.editDrugName();
    DrugsController.deleteDrug();

//        System.out.println(Login.login() ? "WELCOME TO THE HOSPITAL SYSTEM!" : "Failed to login. Please try again.");

    }
}
