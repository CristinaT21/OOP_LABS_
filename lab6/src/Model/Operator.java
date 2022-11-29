package Model;
public class Operator implements PhoneOwner{

    private String name;
    private String surname;
    private boolean response;
    public Operator(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void calls(String passenger, String phone_number, boolean response) {
        if (response) {
            System.out.printf("%s %s responds to %s and assigns a car to the customer." +
                " %n", getName(), getSurname(), phone_number);}
        if (!response){
            System.out.printf("%s %s responds to %s and informs the customer about car unavailability." +
                    " %n", getName(), getSurname(), phone_number);
        }
    }

    @Override
    public void calls(String car, String type, String price) {

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

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }
}
