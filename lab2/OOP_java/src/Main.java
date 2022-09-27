import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create hr object
        HR hr = new HR();
        // hr attributes
        hr.setName("Tina");

        // creating driver objects
        Driver driver1 = new Driver();
        Driver driver2 = new Driver();
        Driver driver3 = new Driver();

        // driver1 attributes
        driver1.setName("John");
        driver1.setSurname("White");
        driver1.setAge(23);
        driver1.setDriving_age(5);
        driver1.setKnow_ro_lang(true);
        driver1.setKnow_ru_lang(true);
        driver1.setKnow_en_lang(false);
        driver1.setWork_exp(0);

        // driver2 attributes
        driver2.setName("Tom");
        driver2.setSurname("Smith");
        driver2.setAge(30);
        driver2.setDriving_age(12);
        driver2.setKnow_ro_lang(true);
        driver2.setKnow_ru_lang(true);
        driver2.setKnow_en_lang(false);
        driver2.setWork_exp(7);

        // driver3 attributes
        driver3.setName("Peter");
        driver3.setSurname("Brown");
        driver3.setAge(21);
        driver3.setDriving_age(3);
        driver3.setKnow_ro_lang(true);
        driver3.setKnow_ru_lang(true);
        driver3.setKnow_en_lang(true);
        driver3.setWork_exp(0);

        // initialize methods for drivers
        driver1.drives();
        driver2.isOnBreak();
        driver3.arrivesToDestination();

        // initialize method for hr
        hr.evaluateSkills();
        // printing drivers scores
        driver1.skill_nr(true);
        driver2.skill_nr(true);
        driver3.skill_nr(true);

        List<Integer> skillArray = new ArrayList<>();
        List<String> nameArray = new ArrayList<>();
        nameArray.add(driver1.getName());
        nameArray.add(driver2.getName());
        nameArray.add(driver3.getName());
        skillArray.add(driver1.skill_nr(false));
        skillArray.add(driver2.skill_nr(false));
        skillArray.add(driver3.skill_nr(false));
        int max_value = Collections.max(skillArray);
        int max_index = skillArray.indexOf(max_value);
        System.out.printf(nameArray.get(max_index) +" is the most skilled with "+ max_value + " points.\n");


        // create passenger objects
        Passenger passenger1 = new Passenger();
        Passenger passenger2 = new Passenger();

        // passenger1 attributes
        passenger1.setName("Steve");
        passenger1.setSurname("Stones");
        passenger1.setPhone_number("079823746");

        // passenger2 attributes
        passenger2.setName("Helen");
        passenger2.setSurname("Cooper");
        passenger2.setPhone_number("068393485");


        // create operator object
        CallCenter operator1 = new CallCenter();
        CallCenter operator2 = new CallCenter();
        // operator attributes
        operator1.setName("Emma");
        operator2.setName("George");
        // operator method
        operator1.respondsToCalls(passenger1.toString(),
                passenger1.getPhone_number());
        operator2.respondsToCalls(passenger2.toString(),
                passenger2.getPhone_number());

        // create object director
        Director director = new Director();
        // director attributes
        director.setName("Richard");
        director.setSurname("Thomson");
        // director method
        director.runsTheBusiness();


        // create car objects
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        // car1 attributes
        car1.setModel_name("Honda");
        car1.setType("sedan");
        car1.setPrice("standard");
        // car2 attributes
        car2.setModel_name("Toyota");
        car2.setType("minivan");
        car2.setPrice("comfort");
        // car3 attributes
        car3.setModel_name("Audi");
        car3.setType("electric");
        car3.setPrice("comfort");

        // car method
        car1.moves();
        car2.honks();
        car3.stay();

        // initialize method for passenger
        passenger1.isCalling(car1.toString(), car1.getType(), car1.getPrice());
        passenger2.getsToDestination();

        driver1.isDriving(String.valueOf(car1), car1.getModel_name(), car1.getType(), car1.getPrice());
        driver2.isDriving(String.valueOf(car2), car2.getModel_name(), car2.getType(), car2.getPrice());
        driver3.isDriving(String.valueOf(car3), car3.getModel_name(), car3.getType(), car3.getPrice());    }



}
