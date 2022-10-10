public interface PhoneOwner extends Person{

    void calls(String passenger, String phone_number, boolean response);

    void calls(String car, String type, String price);
}
