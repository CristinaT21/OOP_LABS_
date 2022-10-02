import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create car objects
        Car car1 = new Car("Honda","sedan", "standard");
        Car car2 = new Car("Toyota","minivan","comfort");
        Car car3 = new Car("Audi", "electric", "comfort");

        // car method
        car1.moves();
        car2.honks();
        car3.stay();

        // create hr object
        HRDepartment hr = new HRDepartment("Tina","Hall");

        // create driver objects
        Driver driver1 = new Driver("John", "White",23,5,true,true,false,0);
        Driver driver2 = new Driver("Tom","Smith",30,12,true,true,false,7);
        Driver driver3 = new Driver("Peter", "Brown", 21,3,true,true,true,0);

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
        System.out.println(nameArray.get(max_index) + " is the most skilled with " + max_value + " points.\n");

        // see which cars are owned by drivers
        driver1.isDriving(String.valueOf(car1), car1.getModel_name(), car1.getType(), car1.getPrice());
        driver2.isDriving(String.valueOf(car2), car2.getModel_name(), car2.getType(), car2.getPrice());
        driver3.isDriving(String.valueOf(car3), car3.getModel_name(), car3.getType(), car3.getPrice());


        // create passenger objects
        Passenger passenger1 = new Passenger("Steve","Stones","079823746");
        Passenger passenger2 = new Passenger("Helen", "Cooper", "068393485");

        // initialize method for passenger
        passenger1.isCalling(car1.toString(), car1.getType(), car1.getPrice());
        passenger2.getsToDestination();

        // mechanic
        Mechanic mechanic1 = new Mechanic("Drake","True", 35,"069553245");
        mechanic1.repairs(car1.toString(), car1.getModel_name(), car1.getType());

        // create operator objects and give attributes
        CallCenter operator1 = new CallCenter("Emma","Real");
        CallCenter operator2 = new CallCenter("George","Green");

        // operator method
        operator1.respondsToCalls(passenger1.toString(), passenger1.getPhone_number());
        operator2.respondsToCalls(passenger2.toString(), passenger2.getPhone_number());

        // it objects with attributes and methods
        ITDepartment it1 = new ITDepartment("Theodor","Holland","App");
        it1.creates();

        ITDepartment it2 = new ITDepartment("Josh","Fast","Website");
        it2.creates();

        // marketing
        Marketing marketing = new Marketing("Bill","Grande" );
        marketing.promotes();

        // business
        Business business1 = new Business("Stela","Parker","Salary");
        business1.creates();

        Business business2 = new Business("Eva","Moon","Price");
        business2.creates();

        // director object with attributes
        Director director = new Director("Richard","Thomson");
        // director method
        director.runsTheBusiness();

    }
}