public class HRDepartment extends Person{
    public HRDepartment(String name, String surname) {
        super(name, surname);
    }
    public void evaluateSkills(){
        System.out.println(getName()+ " "+ getSurname() + " is now evaluating skills.\n");
    }
}
