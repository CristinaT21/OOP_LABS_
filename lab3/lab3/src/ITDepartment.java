public class ITDepartment extends Decision {
    public ITDepartment(String name, String surname,String role) {
        super(name, surname, role);
    }
    @Override
    public void creates() {
        if (getRole() == "App"){
            System.out.println(getName() + " " + getSurname() + " creates the app for the company.\n");
        }
        if (getRole() == "Website"){
            System.out.println(getName() + " " + getSurname() + " creates the website for the company.\n");
        }
    }

}
