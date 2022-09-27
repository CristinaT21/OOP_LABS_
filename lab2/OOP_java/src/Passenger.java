public class Passenger {
    String name;
    String surname;
    String phone_number;

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

    public void isCalling(String car, String type, String price){
        System.out.println(phone_number + " is calling to get a " + price+ " type "+ type + ".\n");
    }

    public void getsToDestination(){
        System.out.println(name + " has arrived to the destination.\n");
    }
}
