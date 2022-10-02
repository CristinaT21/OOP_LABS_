public class Mechanic extends Person{
    private int age;
    private String phone_number;
    public Mechanic(String name, String surname, int age, String phone_number) {
        super(name, surname);
        this.age = age;
        this.phone_number = phone_number;
    }

    public void repairs(String car, String model_name, String type) {
        System.out.println(getName() +" " + getSurname() + " repairs the " + model_name + " " + type+".\n");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
