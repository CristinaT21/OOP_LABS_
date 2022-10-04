public class Marketing {
     String name;
     String surname;

    public void promotes() {
        System.out.println(name + " " + surname + " promotes the company on social sites, radio and television.");
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
