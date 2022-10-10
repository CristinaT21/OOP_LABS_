import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to "+ TaxiCompany.CompanyName+ "!");

        // create hr object
        Rectruiter hr = new Rectruiter("Tina","Hall");

        // create driver objects
        Driver driver1 = new Driver("John", "White",23,5,true,true,false,0);
        Driver driver2 = new Driver("Tom","Smith",30,12,true,true,false,7);
        Driver driver3 = new Driver("Peter", "Brown", 21,3,true,true,true,0);

        List <Driver> DriverArray = new ArrayList<>();
        DriverArray.add(driver1);
        DriverArray.add(driver2);
        DriverArray.add(driver3);

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

        // create car objects
        Car car1 = new Car("Honda","sedan", "standard");
        Car car2 = new Car("Toyota","minivan","comfort");
        Car car3 = new Car("Audi", "electric", "comfort");

        List <Car> CarArray = new ArrayList<>();
        CarArray.add(car1);
        CarArray.add(car2);
        CarArray.add(car3);

        Scanner day = new Scanner(System.in);
        String  dayType;
        System.out.println("Choose day:");
        System.out.println("1 usual day morning or night");
        System.out.println("2 usual day afternoon");
        System.out.println("3 busy day / holiday");
        System.out.println("4 rainy day");
        dayType = day.nextLine();
        if (dayType.equals("1")){
            // usual day morning or night
            DriverArray.get(0).drives();
            CarArray.get(0).moves();
            DriverArray.get(1).drives();
            CarArray.get(1).moves();
            DriverArray.get(2).drives();
            CarArray.get(2).moves();
        }
        if ("2".equals(dayType)) {// usual day afternoon
            DriverArray.get(0).drives();
            CarArray.get(0).moves();
            DriverArray.get(1).isOnBreak();
            CarArray.get(1).stay();
            DriverArray.get(2).isOnBreak();
            CarArray.get(2).stay();
        }
        if ("3".equals(dayType)) {// busy day(holiday)
            DriverArray.get(0).drives();
            CarArray.get(0).moves();
            DriverArray.get(1).drives();
            CarArray.get(1).honks();
            DriverArray.get(2).drives();
            CarArray.get(2).moves();
        }
        if ("4".equals(dayType)) {// rainy day
            DriverArray.get(0).drives();
            CarArray.get(0).honks();
            DriverArray.get(0).drives();
            CarArray.get(1).honks();
            DriverArray.get(0).drives();
            CarArray.get(2).honks();
        }


        // evaluating 1, 2 ,3 or all
        Scanner person = new Scanner(System.in);
        String  personNr;
        System.out.println("Choose driver to be evaluated by recruiter:");
        System.out.println("1 driver1");
        System.out.println("2 driver2");
        System.out.println("3 driver3");
        System.out.println("4 all");
        personNr = person.nextLine();
        if (personNr.equals("1")){
            hr.evaluateSkills(String.valueOf(DriverArray.get(0)), DriverArray.get(0).getName(), DriverArray.get(0).getSurname());
            DriverArray.get(0).skill_nr(true);
        }
        if ("2".equals(personNr)) {
            hr.evaluateSkills(String.valueOf(DriverArray.get(1)), DriverArray.get(1).getName(), DriverArray.get(1).getSurname());
            DriverArray.get(1).skill_nr(true);
        }
        if ("3".equals(personNr)) {
            hr.evaluateSkills(String.valueOf(DriverArray.get(2)), DriverArray.get(2).getName(), DriverArray.get(2).getSurname());
            DriverArray.get(2).skill_nr(true);
        }
        if ("4".equals(personNr)) {
            System.out.println(hr.getName() + " " + hr.getSurname() + " is now evaluating skills of all drivers." );
            DriverArray.get(0).skill_nr(true);
            DriverArray.get(1).skill_nr(true);
            DriverArray.get(2).skill_nr(true);
            System.out.println(" After evaluating, " + hr.getName() + " has decided that " + nameArray.get(max_index) +
                    " is the most skilled with " + max_value + " points.\n");
        }

        // see which cars are owned by drivers
        Scanner driverC = new Scanner(System.in);
        String  driverCar;
        System.out.println("Choose driver to see which car he owns:");
        System.out.println("1 driver1");
        System.out.println("2 driver2");
        System.out.println("3 driver3");
        System.out.println("4 all");
        driverCar = driverC.nextLine();
        if (driverCar.equals("1")) {
            driver1.isDriving(String.valueOf(car1), car1.getModel_name(), car1.getType(), car1.getPrice());
        }
        if ("2".equals(driverCar)) {
            driver2.isDriving(String.valueOf(car2), car2.getModel_name(), car2.getType(), car2.getPrice());
        }
        if ("3".equals(driverCar)) {
            driver3.isDriving(String.valueOf(car3), car3.getModel_name(), car3.getType(), car3.getPrice());
        }
        if ("4".equals(driverCar)) {
            driver1.isDriving(String.valueOf(car1), car1.getModel_name(), car1.getType(), car1.getPrice());
            driver2.isDriving(String.valueOf(car2), car2.getModel_name(), car2.getType(), car2.getPrice());
            driver3.isDriving(String.valueOf(car3), car3.getModel_name(), car3.getType(), car3.getPrice());
        }

        // create operator objects and give attributes
        Operator operator1 = new Operator("Emma","Real");
        Operator operator2 = new Operator("George","Green");
        Operator operator3 = new Operator("Ron", "Tedd");

        List <Operator> OperatorArray = new ArrayList<>();
        OperatorArray.add(operator1);
        OperatorArray.add(operator2);
        OperatorArray.add(operator3);
        // create passenger objects
        Passenger passenger1 = new Passenger("Steve","Stones","079823746");
        Passenger passenger2 = new Passenger("Helen", "Cooper", "068393485");
        Passenger passenger3 = new Passenger("Daniele", "Fox", "069754821");

        List <Passenger> PassengerArray = new ArrayList<>();
        PassengerArray.add(passenger1);
        PassengerArray.add(passenger2);
        PassengerArray.add(passenger3);
        // choose passenger to get taxi
        Scanner passengerS = new Scanner(System.in);
        String  passengerN;
        System.out.println("Choose scenario:");
        System.out.println("1 passenger calls and driver on the way");
        System.out.println("2 passenger calls and driver in traffic");
        System.out.println("3 passenger arrives to destination happy");
        System.out.println("4 passenger arrives to destination unhappy");
        passengerN = passengerS.nextLine();
        if (passengerN.equals("1")) {
            PassengerArray.get(0).calls(CarArray.get(0).toString(), CarArray.get(0).getType(), CarArray.get(0).getPrice());
            OperatorArray.get(0).calls(PassengerArray.get(0).toString(), PassengerArray.get(0).getPhone_number(), true);
            System.out.println(DriverArray.get(0).getName() + " is on his way to customer.");
        }
        if ("2".equals(passengerN)) { // passenger calls, driver in traffic
            PassengerArray.get(0).calls(CarArray.get(0).toString(), CarArray.get(0).getType(), CarArray.get(0).getPrice());
            OperatorArray.get(0).calls(PassengerArray.get(0).toString(), PassengerArray.get(0).getPhone_number(), false);
            System.out.println(DriverArray.get(0).getName() + " is in traffic with another passenger.");
        }

        if ("3".equals(passengerN)) { // passenger arrives to destination happy
            DriverArray.get(1).arrivesToDestination();
            PassengerArray.get(1).getsToDestination(true,
                    String.valueOf(DriverArray.get(1)), DriverArray.get(1).getName());
        }
        if ("4".equals(passengerN)) { // passenger arrives to destination unhappy
            DriverArray.get(2).arrivesToDestination();
            PassengerArray.get(2).getsToDestination(false,
                    String.valueOf(DriverArray.get(2)), DriverArray.get(2).getName());
        }


        // mechanic
        Mechanic mechanic1 = new Mechanic("Drake","True",
                35,"069553245");
        Mechanic mechanic2 = new Mechanic("Pietro","Spaghetti",
                31,"068167496");

        List <Mechanic> MechanicArray = new ArrayList<>();
        MechanicArray.add(mechanic1);
        MechanicArray.add(mechanic2);
        // scenarios about broken cars
        Scanner mechanicS = new Scanner(System.in);
        String mechanicNr;
        for(String s : Arrays.asList("\n", "Choose state of car:", "1 car is working perfectly",
                "2 car is broken", "3 cars are broken", "4 all cars are broken, mechanics available",
                "5 all cars are broken, mechanics unavailable")) {
            System.out.println(s);
        }
        mechanicNr = mechanicS.nextLine();
        if (mechanicNr.equals("1")) {
            CarArray.get(0).works(true);
            MechanicArray.get(0).isOnBreak();
        }
        if (mechanicNr.equals("2")) {
            CarArray.get(1).works(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getModel_name(),CarArray.get(1).getType());

        }
        if (mechanicNr.equals("3")) {
            CarArray.get(0).works(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(0)),
                    CarArray.get(0).getModel_name(),CarArray.get(0).getType());
            CarArray.get(1).works(false);
            MechanicArray.get(1).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getModel_name(),CarArray.get(1).getType());
        }
        if (mechanicNr.equals("4")) {
            CarArray.get(0).works(false);
            MechanicArray.get(0).repairs(String.valueOf(CarArray.get(0)),
                    CarArray.get(0).getModel_name(),CarArray.get(0).getType());
            CarArray.get(1).works(false);
            MechanicArray.get(1).repairs(String.valueOf(CarArray.get(1)),
                    CarArray.get(1).getModel_name(),CarArray.get(1).getType());
            CarArray.get(2).works(false);
            System.out.println("No one is available to repair it.");
        }
        if (mechanicNr.equals("5")) {
            CarArray.get(0).works(false);
            CarArray.get(1).works(false);
            CarArray.get(2).works(false);
            MechanicArray.get(0).isOnBreak();
            MechanicArray.get(1).isOnBreak();
            System.out.println("Company is closed.");
        }


        // developer scenarios
        // it objects with attributes and methods
        Developer it1 = new Developer("Theodor","Holland","App");
        Developer it2 = new Developer("Josh","Fast","Website");

        List <Developer> DeveloperArray = new ArrayList<>();
        DeveloperArray.add(it1);
        DeveloperArray.add(it2);
        Scanner dev = new Scanner(System.in);
        String  devType;
        System.out.println("\n");
        System.out.println("Choose scenario:");
        System.out.println("1 company has no app");
        System.out.println("2 company has no website");
        System.out.println("3 company has no app and website");
        System.out.println("4 company has app and website");
        devType = dev.nextLine();
        if (devType.equals("1")){
            System.out.println("Company has no app.");
            DeveloperArray.get(0).creates();
        }
        if (devType.equals("2")){
            System.out.println("Company has no website.");
            DeveloperArray.get(1).creates();
        }
        if (devType.equals("3")){
            System.out.println("Company has no app.");
            System.out.println("Company has no website.");
            DeveloperArray.get(0).creates();
            DeveloperArray.get(1).creates();
        }
        if (devType.equals("4")){
            System.out.println("Company has an app.");
            System.out.println("Company has a website.");
            DeveloperArray.get(0).maintains();
            DeveloperArray.get(1).maintains();
        }

        // marketing scenarios
        ServicePromoter marketing1 = new ServicePromoter("Bill","Grande" );
        ServicePromoter marketing2 = new ServicePromoter("Teo","Rose" );
        ServicePromoter marketing3 = new ServicePromoter("Andrew","Redd" );
        List <ServicePromoter> ServicePromoterArray = new ArrayList<>();
        ServicePromoterArray.add(marketing1);
        ServicePromoterArray.add(marketing2);
        ServicePromoterArray.add(marketing3);
        Scanner mark = new Scanner(System.in);
        String  markType;
        System.out.println("\n");
        System.out.println("Choose scenario:");
        System.out.println("1 promotion on social media");
        System.out.println("2 promotion on radio");
        System.out.println("3 promotion on tv");
        System.out.println("4 promotion everywhere");
        markType = mark.nextLine();
        if (markType.equals("1")){
            ServicePromoterArray.get(0).supports("media");
        }
        if (markType.equals("2")){
            ServicePromoterArray.get(1).supports("radio");
        }
        if (markType.equals("3")){
            ServicePromoterArray.get(2).supports("tv");
        }
        if (markType.equals("4")){
            ServicePromoterArray.get(0).supports("media");
            ServicePromoterArray.get(1).supports("radio");
            ServicePromoterArray.get(2).supports("tv");
        }


        // business scenarios
        FinancialAnalyst business1 = new FinancialAnalyst("Stela","Parker","Salary");
        FinancialAnalyst business2 = new FinancialAnalyst("Eva","Moon","Price");
        List <FinancialAnalyst> FinancialAnalystArray = new ArrayList<>();
        FinancialAnalystArray.add(business1);
        FinancialAnalystArray.add(business2);
        Scanner fin = new Scanner(System.in);
        String  finType;
        System.out.println("\n");
        System.out.println("Choose scenario:");
        System.out.println("1 salaries need to be set");
        System.out.println("2 road price needs to be set");
        System.out.println("3 salaries and road price need to be set");
        System.out.println("4 salaries and road price are already set");
        finType = fin.nextLine();
        if (finType.equals("1")) {
            FinancialAnalystArray.get(0).supports();
        }
        if (finType.equals("2")) {
            FinancialAnalystArray.get(1).supports();
        }
        if (finType.equals("3")) {
            FinancialAnalystArray.get(0).supports();
            FinancialAnalystArray.get(1).supports();
        }
        if (finType.equals("4")) {
            System.out.println("Because the salaries and road prices are already set:");
            FinancialAnalystArray.get(0).study();
            FinancialAnalystArray.get(1).study();
        }
        // director object with attributes
        Director director = new Director("Richard","Thomson");
        Director vicedirector = new Director("Blake", "Carrington");
        // director method
        Scanner dir = new Scanner(System.in);
        String  dirType;
        System.out.println("\n");
        System.out.println("Choose scenario:");
        System.out.println("1 Director is running company");
        System.out.println("2 Director is leaving company and new director is set");
        System.out.println("3 Director is leaving company and company closing.");
        dirType = dir.nextLine();
        if (dirType.equals("1")) {
            director.runsTheBusiness();
        }
        if (dirType.equals("2")){
            director.leavesCompany();
            System.out.println("A new director is chosen.");
            vicedirector.runsTheBusiness();
        }
        if (dirType.equals("3")) {
            director.leavesCompany();
            System.out.println("The company is closing.");
        }
    }
}