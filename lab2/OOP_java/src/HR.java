public class HR {
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

    public void evaluateSkills(){
        System.out.println(name+ " "+ surname + " is now evaluating skills.\n");
    }

}
