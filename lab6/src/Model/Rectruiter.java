package Model;

public class Rectruiter implements Person{
    private String name;
    private String surname;

    public Rectruiter(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    // add driver
    public void evaluateSkills(String driver, String name, String surname){
        System.out.println(getName()+ " "+ getSurname() + " is now evaluating skills of "+ name + " "+ surname+ ".");
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
