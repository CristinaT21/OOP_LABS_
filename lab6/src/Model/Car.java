package Model;

public class Car implements TaxiCompany{
    private String model_name;
    private String type; // sedan, minivan...
    private String price; // standard comfort

    public Car(String model_name, String type, String price){
        this.model_name = model_name;
        this.type = type;
        this.price = price;
    }

    public void works(boolean work){
        if (work){
            System.out.println(getModel_name() + " is working perfectly.");
        }
        if (!work){
            System.out.println(getModel_name() + " is working poorly.");}
    }
    public void moves(){
        System.out.println(model_name + " is moving.\n");
    }

    public void honks(){
        System.out.println(model_name + " honks in the traffic.\n");
    }

    public void stay(){
        System.out.println(model_name + " is now in the parking lot.\n");
    }

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

