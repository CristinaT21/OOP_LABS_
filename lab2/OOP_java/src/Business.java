public class Business {
    String name;
    String surname;
    String role;


    public void manages(){
        if (role == "Price") {
            System.out.println(name + " " + surname + " sets the price for the ride, depending on the market.\n");
        }
        if (role == "Salary") {
            System.out.println(name + " " + surname + " sets the salary of employees.\n");
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
