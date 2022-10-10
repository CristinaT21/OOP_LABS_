public class FinancialAnalyst implements SalesSupporter{

    private String name;
    private String surname;
    private String role;

    public FinancialAnalyst(String name, String surname, String role){
        this.name = name;
        this.surname = surname;
        this.role = role;
    }
    @Override
    public void supports() {
        if (getRole() == "Price") {
            System.out.println(getName() + " " + getSurname() + " sets the price for the ride, depending on the market.\n");
        }
        if (getRole() == "Salary") {
            System.out.println(getName() + " " + getSurname() + " sets the salary of employees.\n");
        }
    }

    public void study(){
        if (getRole() == "Price") {
            System.out.println(getName() + " " + getSurname() + " is studying the market, and waiting for changes.\n");
        }
        if (getRole() == "Salary") {
            System.out.println(getName() + " " + getSurname() + " is analysing the budget of company, and thinking of ways to distribute it.\n");
        }
    }
    @Override
    public void supports(String platform) {

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
