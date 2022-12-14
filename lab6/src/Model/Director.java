package Model;

public class Director implements Person{
    private String name;
    private String surname;
    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void runsTheBusiness(){
        System.out.println(getName() + " " + getSurname() + " is running the taxi company " + TaxiCompany.CompanyName +".");
    }

    public void leavesCompany(){
        System.out.println(getName() + " " + getSurname() + " is leaving the taxi company " + TaxiCompany.CompanyName +".");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
