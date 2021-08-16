package Com.company.HospitalController;

public class Doctor {

    private int id;
    private String First_name;
    private String Last_Name;
    private String Specialisation;
    private int Phone;


    public  Doctor(){

    }

    public Doctor(int id, String First_name, String Last_Name, String Specialisation, int Phone){
        this.id = id;
        this.First_name = First_name;
        this.Last_Name = Last_Name;
        this.Specialisation = Specialisation;
        this.Phone = Phone;
    }

//    Getters and setters for Doctor


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }
}
