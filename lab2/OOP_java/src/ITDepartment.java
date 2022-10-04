public class ITDepartment {
    String name;
    String surname;
    String role;

    public void creates() {
        if (role == "App"){
            System.out.println(name + " " + surname + " creates the app for the company.\n");
        }
        if (role == "Website"){
            System.out.println(name + " " + surname + " creates the website for the company.\n");
        }
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
