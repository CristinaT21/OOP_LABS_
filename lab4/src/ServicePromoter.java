public class ServicePromoter implements SalesSupporter{
    private String name;
    private String surname;
    public ServicePromoter(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    @Override
    public void supports(String platform){
        if (platform.equals("media")){
            System.out.printf("%s %s promotes the company on social sites.\n" +
                "%n", getName(), getSurname());}
        if (platform.equals("radio")){
            System.out.printf("%s %s promotes the company on radio.\n" +
                "%n", getName(), getSurname());}
        if (platform.equals("tv")){
            System.out.printf("%s %s promotes the company on television.\n" +
                "%n", getName(), getSurname());}
    }

    @Override
    public void supports() {

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
}
