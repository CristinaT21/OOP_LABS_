public class Decision extends Person{
    private String role;
    public Decision(String name, String surname, String role) {
        super(name, surname);
        this.role = role;
    }
    public void creates(){
        System.out.println(" ");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
