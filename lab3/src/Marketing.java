public class Marketing extends Person{

    public Marketing(String name, String surname) {
        super(name, surname);
    }
    public void promotes() {
        System.out.printf("%s %s promotes the company on social sites, radio and television.\n" +
                "%n", getName(), getSurname());
    }
}
