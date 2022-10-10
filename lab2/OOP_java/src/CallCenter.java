public class CallCenter {
    String name;
    String surname;

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

    public <phone_number> void respondsToCalls(String passenger, String phone_number){
        System.out.println(name +" " + surname + " responds to " + phone_number + " and assigns a car to the customer.\n ");
    }
}

