public class CallCenter extends Person{

    public CallCenter(String name, String surname) {
        super(name, surname);
    }

    public void respondsToCalls(String passenger, String phone_number){
        System.out.printf("%s %s responds to %s and assigns a car to the customer.\n" +
                " %n", getName(), getSurname(), phone_number);
    }
}
