public class Mechanic {
    String name;
    String surname;
    int age;
    String phone_number;

    public void repairs(String car, String model_name, String type) {
        System.out.println(name +" " + surname + " repairs the " + model_name + " " + type+".\n");
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
