public class CallCenter {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <phone_number> void respondsToCalls(String passenger, String phone_number){
        System.out.println(name +" responds to " + phone_number + " and assigns a car to the customer.\n ");
    }


}

