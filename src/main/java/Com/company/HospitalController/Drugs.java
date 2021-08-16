package Com.company.HospitalController;

public class Drugs {

    private int id;
    private String drug_name;
    private String drug_use_case;

    public Drugs(){

    }

    public Drugs(int id, String drug_name,String drug_use_case) {
        this.id = id;
        this.drug_name = drug_name;
        this.drug_use_case = drug_use_case;
    }

//    Getting and setters for Drugs;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDrug_use_case() {
        return drug_use_case;
    }

    public void setDrug_use_case(String drug_use_case) {
        this.drug_use_case = drug_use_case;
    }
}
