public class Passenger implements PhoneOwner{
    private String name;
    private String surname;
    private String phone_number;
    private boolean happy;
    public Passenger(String name, String surname,String phone_number) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    @Override
    public void calls(String passenger, String phone_number, boolean response) {

    }

    @Override
    public void calls(String car, String type, String price) {
        System.out.println(phone_number + " is calling to get a " + price+ " type "+ type + ".");
    }
    public void getsToDestination(boolean happy, String driver, String name){
        if (happy){
        System.out.println(getName() + " has arrived to the destination happy.");
            System.out.println(name + " got tips.");}
        else {
            System.out.println(getName() + " has arrived to the destination unhappy.");
            System.out.println(name + " didn't got any tips.");
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

}
