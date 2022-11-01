import java.nio.charset.Charset;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        boolean works = true;

            System.out.println("Welcome to " + TaxiCompany.CompanyName + "!");
            float Money = 0.1f;
            Scanner money = new Scanner(System.in);
            Float  moneyType;
            System.out.println("Choose money:");
            moneyType = Float.valueOf(money.nextLine());

            Random generate = new Random();
            String[] names = {"John", "Marcus", "Susan", "Henry", "Olivia", "Noah", "Emma", "Liam", "Amelia"
                    , "Oliver", "Ava", "Elijah", "Sophia", "Mateo", "Isabella", "Lucas", "Luna", "Levi", "Mia"
                    , "Asher", "Charlotte", "James", "Evelyn", "Leo", "Harper", "Grayson", "Scarlett", "Luca"
                    , "Nova", "Ezra", "Aurora", "Ethan", "Ella", "Aiden", "Mila", "Wyatt", "Aria", "Sebastian"
                    , "Ellie", "Mason", "Gianna", "Benjamin", "Sofia", "Henry", "Violet", "Hudson", "Layla"
                    , "Jack", "Willow", "Jackson", "Lily", "Owen", "Hazel", "Daniel", "Avery", "Alexander"
                    , "Camila", "Kai", "Chloe", "Elena", "Carter", "Paisley", "Gabriel", "Eliana", "William"
                    , "Julian", "Athena", "Theodore", "Delilah", "Isaiah", "Naomi", "Matthew", "Penelope"
                    , "Logan", "Eleanor", "Michael", "Ivy", "Samuel", "Elizabeth", "Isla", "Ezekiel", "Jaxon"
                    , "Riley", "Waylon", "Abigail", "Jayden", "Nora", "Luke", "Stella", "Grace", "Lincoln"
                    , "Theo", "Elias", "Zoey", "Josiah", "Emily", "Jacob", "David", "Emilia", "Peter", "Addison"};
            String[] surnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis"
                    , "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas"
                    , "Hernandez", "Moore", "Martin", "Jackson", "Thompson", "White", "Lopez", "Lee"
                    , "Gonzalez", "Harris", "Clark", "Lewis", "Robinson", "Walker", "Perez", "Hall"
                    , "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker", "Adams"
                    , "Nelson", "Hill", "Ramirez", "Campbell", "Mitchell", "Roberts", "Carter", "Phillips"
                    , "Evans", "Turner", "Torres", "Parker", "Collins", "Edwards", "Stewart", "Flores"
                    , "Morris", "Nguyen", "Murphy", "Rivera", "Cook", "Rogers", "Morgan", "Peterson"
                    , "Cooper", "Reed", "Bailey", "Bell", "Gomez", "Kelly", "Howard", "Ward", "Cox", "Diaz"
                    , "Richardson", "Wood", "Watson", "Brooks", "Bennett", "Gray", "James", "Reyes", "Cruz"
                    , "Hughes", "Price", "Myers", "Long", "Foster", "Sanders", "Ross", "Morales", "Powell"
                    , "Sullivan", "Russell", "Ortiz", "Jenkins", "Gutierrez", "Perry", "Hart", "Kazar", "Redd"};
            String[] models = {"Abarth", "Alfa Romeo", "Aston Martin", "Audi", "Bentley", "BMW", "Bugatti"
                    , "Cadillac", "Chevrolet", "Chrysler", "Citroën", "Dacia", "Daewoo", "Daihatsu", "Dodge"
                    , "Donkervoort", "DS", "Ferrari", "Fiat", "Fisker", "Ford", "Honda", "Hummer", "Hyundai"
                    , "Infiniti", "Iveco", "Jaguar", "Jeep", "Kia", "KTM", "Lada", "Lamborghini", "Lancia"
                    , "Land Rover", "Landwind", "Lexus", "Lotus", "Maserati", "Maybach", "Mazda", "McLaren"
                    , "Mercedes-Benz", "MG", "Mini", "Mitsubishi", "Morgan", "Nissan", "Opel", "Peugeot"
                    , "Porsche", "Renault", "Rolls-Royce", "Rover", "Saab", "Seat", "Skoda", "Smart"
                    , "SsangYong", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo"};
            String[] types = {"Micro", "Sedan", "Hatchback", "SUV", "MPV", "Convertible"
                    , "Wagon", "Luxury", "Antique", "Coupe", "Sports Car", "Supercar"
                    , "Muscle Car", "Limousine", "Hybrid", "Electric", "Diesel", "Minivan"};
            String[] prices = {"standard", "comfort"};
            String[] numbers = {"360 921-2711", "801 459-3961", "919 551-0236", "410 686-3679",
                    "661 884-0245", "847 725-6735", "559 510-7219", "401 525-9527", "760 692-1213"
                    , "657 633-1153", "802 108-8568", "804 691-5495", "747 888-9426", "228 708-0759"
                    , "701 849-2413", "908 948-3818", "418 567-7748", "847 312-1744", "213 205-2808"
                    , "203 968-8593", "469 767-0882", "715 900-3666", "905 050-1079", "856 761-1261"
                    , "309 778-7372", "669 485-2980", "551 416-8772", "678 934-9373", "385 819-9485"
                    , "281 438-3598", "581 907-5076", "910 566-3061", "563 348-3065", "612 043-6593"
                    , "615 527-1701", "682 174-0140", "405 733-6070", "806 316-7700", "606 570-9467"
                    , "606 130-4448", "931 303-7359", "737 829-0766", "678 751-5433", "403 225-1552"
                    , "432 415-0237", "952 554-6718", "619 023-9736", "808 872-3736", "504 692-6208"
                    , "409 290-4894", "667 345-7512", "302 132-5488", "908 912-1816", "438 109-3935"
                    , "936 019-8025", "818 806-7043", "340 006-8125", "704 106-6251", "929 223-1442"
                    , "806 625-6430", "956 113-0858", "726 653-2841", "339 492-9719", "226 599-4731"
                    , "507 510-0237", "770 026-8186", "351 235-9855", "606 738-8015", "727 735-7133"
                    , "702 889-8331", "854 342-5223", "209 683-6320", "320 161-9592", "435 752-9861"
                    , "925 737-0788", "801 545-6795", "947 478-0373", "562 870-8536", "404 299-9753"
                    , "601 987-4948", "212 609-0164", "309 228-7291", "806 209-1472", "680 794-5661"
                    , "763 449-0168", "709 763-6840", "331 969-3351", "978 241-6454", "925 106-0849"
                    , "313 371-9670", "856 419-0566", "848 972-3523", "867 742-1291", "253 497-5662"
                    , "507 434-9639", "626 479-8461", "403 000-9729", "647 693-0223", "865 274-6716"};

            // create hr object
            Rectruiter hr = new Rectruiter("Tina", "Hall");

            // create driver objects
            Driver[] driver;
            driver = new Driver[100];
            List<Driver> DriverArray = new ArrayList<>();
//            List<Integer> skillArray = new ArrayList<>();
//            List<String> nameArray = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                driver[i] = new Driver(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), getRandomNumberInRange(18, 70), getRandomNumberInRange(0, 50), generate.nextBoolean(), generate.nextBoolean(), generate.nextBoolean(), getRandomNumberInRange(0, 30));
                DriverArray.add(driver[i]);
//                nameArray.add(driver[i].getName());
//                skillArray.add(driver[i].skill_nr(false));
            }

//            int max_value = Collections.max(skillArray);
//            int max_index = skillArray.indexOf(max_value);

            //Remove incompetent drivers (FIX CODE!)
            List<String> i_list = new ArrayList<>();
            int j = 0;
            for (int i = 0; i < 100; i++) {
//                hr.evaluateSkills(String.valueOf(DriverArray.get(i)), DriverArray.get(i).getName(), DriverArray.get(i).getSurname());
                DriverArray.get(j).skill_nr(true);
                if (Objects.equals(DriverArray.get(j).skill_nr(false), 2)) {
                    i_list.add(String.valueOf(i));
                    DriverArray.remove(j);
                    j -= 1;
                }
                System.out.println(DriverArray.size());
                j+=1;
            }
            System.out.println(i_list);
//            for (int i = 0; i < i_list.size(); i++) {
//                System.out.println(i_list.get(i));
//
//            }

            System.out.println(DriverArray.size());

            //
            // create car objects
            Car[] car;
            car = new Car[DriverArray.size()];
            List<Car> CarArray = new ArrayList<>();
            for (int i = 0; i < DriverArray.size(); i++) {
                car[i] = new Car(String.valueOf(models[generate.nextInt(models.length)]), String.valueOf(types[generate.nextInt(types.length)]), String.valueOf(prices[generate.nextInt(prices.length)]));
                CarArray.add(car[i]);
            }
            Passenger[] passenger;
            passenger = new Passenger[100];
            List<Passenger> PassengerArray = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                passenger[i] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                PassengerArray.add(passenger[i]);
            }

            // developer scenarios
            // it objects with attributes and methods
            Developer it1 = new Developer("Theodor", "Holland", "App");
            Developer it2 = new Developer("Josh", "Fast", "Website");
            ServicePromoter marketing1 = new ServicePromoter("Bill", "Grande");
            ServicePromoter marketing2 = new ServicePromoter("Teo", "Rose");
            ServicePromoter marketing3 = new ServicePromoter("Andrew", "Redd");
            Director director = new Director("Richard", "Thomson");
            Director vicedirector = new Director("Blake", "Carrington");
            Operator operator1 = new Operator("Emma","Real");
            Operator operator2 = new Operator("George","Green");
            Operator operator3 = new Operator("Ron", "Tedd");
            List <Operator> OperatorArray = new ArrayList<>();
            OperatorArray.add(operator1);
            OperatorArray.add(operator2);
            OperatorArray.add(operator3);
            Mechanic mechanic1 = new Mechanic("Drake","True",
                    35,"069553245");
            Mechanic mechanic2 = new Mechanic("Pietro","Spaghetti",
                    31,"068167496");
            List <Mechanic> MechanicArray = new ArrayList<>();
            MechanicArray.add(mechanic1);
            MechanicArray.add(mechanic2);
            FinancialAnalyst business1 = new FinancialAnalyst("Stela","Parker","Salary");
            FinancialAnalyst business2 = new FinancialAnalyst("Eva","Moon","Price");
            int clients;
            boolean app = false, web= false, media= false, radio= false, tv= false, promotion= false;
            int day = 1;
            List<Driver> OccupiedDrivers = new ArrayList<>();


            while (works) {
                float initialPrice=getRandomNumberInRange(45, 50)/10;
                float fuelPrice=getRandomNumberInRange(42, 48)/10;
            float MoneyDay = 0, MoneyFuel = 0;

            for(int i=0; i<24; i++){
                int unhappyClients = 0;
                 int NoClients = getsNoClients(i);
                 for (j = 0; j<=NoClients; j++){
                     OccupiedDrivers.add(DriverArray.get(0));
                     DriverArray.remove(0);
                     System.out.println(OperatorArray.get(getRandomNumberInRange(0,2)).getName() + " responds to "
                             + PassengerArray.get(getRandomNumberInRange(0, 4)).getPhone_number() + " and assigns the car "
                             +CarArray.get(getRandomNumberInRange(0,20)).getModel_name()+ " "
                             + CarArray.get(getRandomNumberInRange(0,20)).getType() + " " +
                             CarArray.get(getRandomNumberInRange(0,20)).getPrice() + ".");
                 }
                 unhappyClients = (int) (unhappyClients + Math.floor(NoClients*0.1F));
                 for (int m=0; m<unhappyClients; m++ ){
                     System.out.println(PassengerArray.get(0));
                     PassengerArray.remove(0);
                 }
                 MoneyDay = MoneyDay + NoClients*initialPrice*getsCoef(i);
                 MoneyFuel = MoneyFuel + NoClients*fuelPrice;
                for (int k = 0; k<=NoClients; k++){
                    DriverArray.add(OccupiedDrivers.get(0));
                    OccupiedDrivers.remove(0);
                }
                System.out.println("Day "+ day +", hour " + String.valueOf(i));

                clients = PassengerArray.size();
                if (clients < 10 && Money > 10000) {
                    it1.creates();
                    app = true;
                    Money = Money - 10000;
                }
                if (clients < 10 && Money > 6000) {
                    marketing1.supports("media");
                    marketing2.supports("radio");
                    marketing3.supports("tv");
                    promotion = true;
                    Money = Money - 6000;
                }
                if (clients < 10 && Money > 3000 && promotion == false) {
                    marketing1.supports("media");
                    media = true;
                    Money = Money - 3000;
                }
                if (clients < 10 && Money > 1000 && promotion == false) {
                    marketing2.supports("radio");
                    radio = true;
                    Money = Money - 1000;
                }
                if (clients < 10 && Money > 200 && promotion == false) {
                    marketing3.supports("tv");
                    tv = true;
                    Money = Money - 200;
                }
                if (clients < 10 && Money > 500 && web == false) {
                    it2.creates();
                    web = true;
                    Money = Money - 500;
                }

                if (Money <= 0) {
                    System.out.println("The company is bankrupt because of lack of money.");
                    works = false;
                    break;
                }
                if (clients <= 0) {
                    System.out.println("The company is bankrupt because of lack of clients.");
                    works = false;
                    break;
                }
                if (DriverArray.size() <= 0) {
                    System.out.println("The company is bankrupt because of lack of drivers.");
                    works = false;
                    break;
                }

                Money = Money + MoneyDay - MoneyFuel;
            }

            clients = PassengerArray.size();
            if (app) {
                if (clients <= 94){
                    for (int l = clients; l <clients+ 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Money = Money - 55;
            }
            if (web) {
                if (clients <= 97){
                    for (int l = clients; l <clients+ 2; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                Money = Money - 50;
            }
            if (promotion) {
                if (clients <= 91){
                    for (int l = clients; l <clients+ 8; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                promotion = false;
            }
            if (media) {
                if (clients <= 94){
                    for (int l = clients; l <clients+ 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                media = false;
            }
            if (tv) {
                if (clients <= 98){
                    for (int l = clients; l <clients+ 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                tv = false;
            }
            if (radio) {
                if (clients <= 98){
                    for (int l = clients; l <clients+ 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]), String.valueOf(surnames[generate.nextInt(100)]), String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                radio = false;
            }

            if (day % 182 == 0 && Money > 100000){
                int priceCar = getRandomNumberInRange(60000, 99999);
                Money -= priceCar;
                for (int s = 0; s<= 35; s++){
                    MechanicArray.get(getRandomNumberInRange(0,1)).repairs(CarArray.get(getRandomNumberInRange(0,20)).getModel_name(),
                        CarArray.get(getRandomNumberInRange(0,20)).getType(),
                        CarArray.get(getRandomNumberInRange(0,20)).getPrice());

                }
                System.out.println("New cars have been added to auto park.");
            }

                System.out.println("Money profit is " + (MoneyDay-MoneyFuel));
                System.out.println("Money company has " + String.valueOf(Money));

            if (day == getRandomNumberInRange(60*365, 80*365)){
                System.out.println("Director has died. His son decided to close the company.");
                break;
            }
            day++;




            //if (no_d_v) {

            //}
            //if(CarArray.get(i).getPrice("comfort")){ride=ride+10;}

/*
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
        }*/
        }
    }
        public static int getsNoClients(int hour){
        int NoClients = 0;
            if (hour<6){
                NoClients = getRandomNumberInRange(1,4);
            } else if (hour>=6 && hour <=18) {
                NoClients = getRandomNumberInRange(4, 9);
            } else if (hour>18 && hour <24) {
                NoClients = getRandomNumberInRange(8, 15);
            }
            return NoClients;
        }
        public static float getsCoef(int hour){
            float Coef = 0;
            if (hour<6){
                Coef = 1.5F;
            } else if (hour>=6 && hour <=18) {
                Coef = 1;
            } else if (hour>18 && hour <24) {
                Coef = 1.2F;        }
            return Coef;
        }
        private static int getRandomNumberInRange ( int min, int max){

            if (min >= max) {
                throw new IllegalArgumentException("max must be greater than min");
            }

            Random r = new Random();
            return r.nextInt((max - min) + 1) + min;
        }
//    public String Ran() {
//        byte[] array = new byte[500];
//        new Random().nextBytes(array);
//
//        String randomString
//                = new String(array, Charset.forName("UTF-8"));
//
//        // Create a StringBuffer to store the result
//        StringBuffer r = new StringBuffer();
//
//        // Append first 20 alphanumeric characters
//        // from the generated random String into the result
//        for (int k = 0; k < randomString.length(); k++) {
//
//            char ch = randomString.charAt(k);
//
//            if (r.length()<8){
//                if (ch >= '0' && ch <= '9') {
//                r.append(ch);
//                }
//            }
//            if (r.length()==8){break;}
//        }
//        return r;
//    }
}