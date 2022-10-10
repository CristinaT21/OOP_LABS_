public class                                                                     Passenger extends Person{
    private String phone_number;
    public Passenger(String name, String surname,String phone_number) {
        super(name, surname);
        this.phone_number = phone_number;
    }
    public void isCalling(String car, String type, String price){
        System.out.println(phone_number + " is calling to get a " + price+ " type "+ type + ".\n");
    }

    public void getsToDestination(){
        System.out.println(getName() + " has arrived to the destination.\n");
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
