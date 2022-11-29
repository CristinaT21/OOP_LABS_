package Model;

public class Developer implements Person{
    private String name;
    private String surname;
    private String role;

    public Developer(String name, String surname, String role){
        this.name = name;
        this.surname = surname;
        this.role = role;
    }
    public void creates() {
        if (getRole() == "App"){
            System.out.println(getName() + " " + getSurname() + " creates the app for the company.");
        }
        if (getRole() == "Website"){
            System.out.println(getName() + " " + getSurname() + " creates the website for the company.");
        }
    }
    public void maintains() {
        if (getRole() == "App"){
            System.out.println(getName() + " " + getSurname() + " maintains the app for the company.");
        }
        if (getRole() == "Website"){
            System.out.println(getName() + " " + getSurname() + " maintains the website for the company.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
