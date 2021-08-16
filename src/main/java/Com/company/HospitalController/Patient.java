package Com.company.HospitalController;

public class Patient {

//    Declaring feaures of the patient

    private int id;
    private String First_name;
    private String Second_name; // LAST NAME OF THE PATIENT
    private int Age;
    private String Diagnose;
    private int Ward_no;

    public Patient(){

    }
   public Patient(int id, String First_name, String Second_name, int Age, String Diagnose, int Ward_no){
       this.id = id;
       this.First_name = First_name;
       this.Second_name = Second_name; // LAST NAME OF THE PATIENT
       this.Age = Age;
       this.Diagnose = Diagnose;
       this.Ward_no = Ward_no;
   }


//   Getting and setters for Patient

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

    public String getSecond_name() {
        return Second_name;
    }

    public void setSecond_name(String second_name) {
        Second_name = second_name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDiagnose() {
        return Diagnose;
    }

    public void setDiagnose(String diagnose) {
        Diagnose = diagnose;
    }

    public int getWard_no() {
        return Ward_no;
    }

    public void setWard_no(int ward_no) {
        Ward_no = ward_no;
    }


}
