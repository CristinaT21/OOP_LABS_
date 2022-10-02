public class Business extends Decision {

    public Business(String name, String surname, String role) {
        super(name, surname, role);
    }
    @Override
    public void creates(){
        if (getRole() == "Price") {
            System.out.println(getName() + " " + getSurname() + " sets the price for the ride, depending on the market.\n");
        }
        if (getRole() == "Salary") {
            System.out.println(getName() + " " + getSurname() + " sets the salary of employees.\n");
        }
    }
}
