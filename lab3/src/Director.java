public class Director extends Person{
    public Director(String name, String surname) {
        super(name, surname);
    }
    public void runsTheBusiness(){
        System.out.println(getName() + " " + getSurname() + " is running the taxi company " + getCompanyName()+".\n");
    }
}
