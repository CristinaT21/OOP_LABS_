import java.nio.charset.Charset;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        boolean works = true;

        System.out.println("Welcome to " + TaxiCompany.CompanyName + "!");
        Director director = new Director("Richard", "Thomson");
        Director vicedirector = new Director("Blake", "Carrington");
        director.runsTheBusiness();
        Scanner money = new Scanner(System.in);
        Float  moneyType;
        System.out.println("Choose the amount of money as a start for the company: ");
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
                , "Cadillac", "Chevrolet", "Chrysler", "Citro??n", "Dacia", "Daewoo", "Daihatsu", "Dodge"
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

        FinancialAnalyst business1 = new FinancialAnalyst("Stela","Parker","Salary");
        FinancialAnalyst business2 = new FinancialAnalyst("Eva","Moon","Price");
        List <FinancialAnalyst> FinancialAnalystArray = new ArrayList<>();
        FinancialAnalystArray.add(business1);
        FinancialAnalystArray.add(business2);
        // create hr object
        Rectruiter hr = new Rectruiter("Tina", "Hall");
        //int driver_nr;
        Scanner driver_nr = new Scanner(System.in);
        int  driver_type;
        System.out.println("Choose number of drivers: ");
        driver_type = Integer.valueOf(driver_nr.nextLine());
        // create driver objects
        Driver[] driver;
        driver = new Driver[driver_type];
        List<Driver> DriverArray = new ArrayList<>();
        for (int i = 0; i < driver_type; i++) {
            driver[i] = new Driver(String.valueOf(names[generate.nextInt(100)]),
                    String.valueOf(surnames[generate.nextInt(100)]), getRandomNumberInRange(18, 70),
                    getRandomNumberInRange(0, 50), generate.nextBoolean(), generate.nextBoolean(),
                    generate.nextBoolean(), getRandomNumberInRange(0, 30));
            DriverArray.add(driver[i]);
        }

        List<String> i_list = new ArrayList<>();
        int j = 0;
        System.out.println(hr.getName() + " is evaluating the skills of all potential employees.");
        //hr.evaluateSkills(String.valueOf(DriverArray.get(i)), DriverArray.get(i).getName(), DriverArray.get(i).getSurname());
        for (int i = 0; i < driver_type; i++) {
            DriverArray.get(j).skill_nr(true);
            if (Objects.equals(DriverArray.get(j).skill_nr(false), 2)) {
                i_list.add(String.valueOf(i));
                DriverArray.remove(j);
                j -= 1;
            }
            System.out.println(DriverArray.size());
            j+=1;
        }
        System.out.println("The incompetent drivers for the job are: " + i_list);
        System.out.println("The number of drivers hired is " + DriverArray.size());

        FinancialAnalystArray.get(0).supports();
        // create car objects
        Car[] car;
        car = new Car[DriverArray.size()];
        List<Car> CarArray = new ArrayList<>();
        for (int i = 0; i < DriverArray.size(); i++) {
            car[i] = new Car(String.valueOf(models[generate.nextInt(models.length)]),
                    String.valueOf(types[generate.nextInt(types.length)]),
                    String.valueOf(prices[generate.nextInt(prices.length)]));
            CarArray.add(car[i]);
        }

        Scanner passenger_nr = new Scanner(System.in);
        int  passenger_type;
        System.out.println("Choose number of clients: ");
        passenger_type = Integer.valueOf(passenger_nr.nextLine());
        Passenger[] passenger;
        passenger = new Passenger[passenger_type];
        List<Passenger> PassengerArray = new ArrayList<>();
        for (int i = 0; i < passenger_type; i++) {
            passenger[i] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                    String.valueOf(surnames[generate.nextInt(100)]),
                    String.valueOf(numbers[generate.nextInt(numbers.length)]));
            PassengerArray.add(passenger[i]);
        }

        // assign car to driver
        for(int i= 0; i<DriverArray.size(); i++){
            DriverArray.get(i).isDriving(String.valueOf(CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)))
                    ,String.valueOf(models[generate.nextInt(models.length)]),
                    String.valueOf(types[generate.nextInt(types.length)]),
                    String.valueOf(prices[generate.nextInt(prices.length)]));
        }
        // developer scenarios
        // it objects with attributes and methods
        Developer it1 = new Developer("Theodor", "Holland", "App");
        Developer it2 = new Developer("Josh", "Fast", "Website");

        ServicePromoter marketing1 = new ServicePromoter("Bill", "Grande");
        ServicePromoter marketing2 = new ServicePromoter("Teo", "Rose");
        ServicePromoter marketing3 = new ServicePromoter("Andrew", "Redd");

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
        int clients;
        boolean app = false, web= false, media= false, radio= false, tv= false, promotion= false;
        int day = 1;
        List<Driver> OccupiedDrivers = new ArrayList<>();
        boolean moneyCars = true;
        if(moneyType<15000*DriverArray.size()){
            System.out.println("Company has no money to start the business. Cars are expensive");
            works=false;
        }
        int dir_die = getRandomNumberInRange(40*365, 60*365);
        int number_die = getRandomNumberInRange(0,3);
        float initialPrice=getRandomNumberInRange(45, 50)/10;
        float fuelPrice=getRandomNumberInRange(42, 48)/10;
        float cl_coef = 0.1F;
        while (works) {

            if(moneyCars){
                moneyType-=15000*DriverArray.size();
                moneyCars=false;
            }
            if (number_die==0 && day>657){
                FinancialAnalystArray.get(1).supports();
                fuelPrice=7.2f;
            }
            if (number_die==1 && day==657){
                cl_coef=0.15f;
            }
            float MoneyDay = 0, MoneyFuel = 0;

            for(int i=0; i<24; i++){
                 int unhappyClients = 0;
                 int NoClients = getsNoClients(i);
                 if(PassengerArray.size()==0){
                    System.out.println("The company is closed because of lack of clients.");
                    break;
                }
                if (NoClients>PassengerArray.size()){
                    break;
                }
                 for (j = 0; j<=NoClients; j++){

                     OccupiedDrivers.add(DriverArray.get(0));
                     DriverArray.remove(0);

                     System.out.printf("%s responds to %s and assigns the car %s %s %s.%n",
                             OperatorArray.get(getRandomNumberInRange(0, OperatorArray.size()-1)).getName(),
                             PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size()-1)).getPhone_number(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getModel_name(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getType(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getPrice());
                 }

                 unhappyClients = (int) (unhappyClients + Math.floor(NoClients*cl_coef));
                 for (int m=0; m<unhappyClients; m++ ){
                     System.out.println(PassengerArray.get(0));
                     PassengerArray.get(0).calls(CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).toString(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getType(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getPrice());
                     OperatorArray.get(0).calls(PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size()-1)).toString(),
                             PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size()-1)).getPhone_number(),
                             false);
                     PassengerArray.remove(0);
                     System.out.println(DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getName()
                             + " is in traffic with another passenger.");
                     PassengerArray.get(m).getsToDestination(false,
                             String.valueOf(DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1))),
                             DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getName());
                 }
                 int happyClients = NoClients - unhappyClients;
                 for(int n = 0; n<happyClients; n++){
                     PassengerArray.get(n).calls(CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).toString(),
                             CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getType(), CarArray.get(0).getPrice());
                     OperatorArray.get(getRandomNumberInRange(0,2)).calls(PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size()-1)).toString(),
                             PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size()-1)).getPhone_number(), true);
                     System.out.println(DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getName()
                             + " is on his way to the customer.");
                     PassengerArray.get(n).getsToDestination(true,
                             String.valueOf(DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1))),
                             DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getName());

                 }
                 MoneyDay = MoneyDay + NoClients*initialPrice*getsCoef(i);
                 MoneyFuel = MoneyFuel + NoClients*fuelPrice;
                for (int k = 0; k<=NoClients; k++){
                    DriverArray.add(OccupiedDrivers.get(0));
                    OccupiedDrivers.remove(0);
                }
                System.out.println("Day "+ day +", hour " + String.valueOf(i));

                clients = PassengerArray.size();
                if (clients < 30 && moneyType > 10000) {
                    it1.creates();
                    app = true;
                    moneyType = moneyType - 10000;
                }
                if (clients < 30 && moneyType > 6000) {
                    marketing1.supports("media");
                    marketing2.supports("radio");
                    marketing3.supports("tv");
                    promotion = true;
                    moneyType = moneyType - 6000;
                }
                if (clients < 30 && moneyType > 3000 && promotion == false) {
                    marketing1.supports("media");
                    media = true;
                    moneyType = moneyType - 3000;
                }
                if (clients < 30 && moneyType > 1000 && promotion == false) {
                    marketing2.supports("radio");
                    radio = true;
                    moneyType = moneyType - 1000;
                }
                if (clients < 30 && moneyType > 200 && promotion == false) {
                    marketing3.supports("tv");
                    tv = true;
                    moneyType = moneyType - 200;
                }
                if (clients < 30 && moneyType > 500 && web == false) {
                    it2.creates();
                    web = true;
                    moneyType = moneyType - 500;
                }
                if (clients <= NoClients) {
                    System.out.println("The company is bankrupt because of lack of clients.");
                    works = false;
                    break;
                }
                if (moneyType < 0) {
                    System.out.println("The company is bankrupt because of lack of money.");
                    works = false;
                    break;
                }

                if (DriverArray.size() <= 0) {
                    System.out.println("The company is bankrupt because of lack of drivers.");
                    works = false;
                    break;
                }

                moneyType = moneyType + MoneyDay - MoneyFuel;
            }

            clients = PassengerArray.size();
            if (app) {
                if (clients <= passenger_type-6){
                    for (int l = clients; l <clients+ 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                moneyType = moneyType - 55;
            }
            if (web) {
                if (clients <= passenger_type-3){
                    for (int l = clients; l <clients+ 2; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                moneyType = moneyType - 50;
            }
            if (promotion) {
                if (clients <= passenger_type-9){
                    for (int l = clients; l <clients+ 8; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                promotion = false;
            }
            if (media) {
                if (clients <= passenger_type-5){
                    for (int l = clients; l <clients+ 5; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                media = false;
            }
            if (tv){
                if (clients <= passenger_type-1){
                    for (int l = clients; l <clients+ 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                tv = false;
            }
            if (radio){
                if (clients <= passenger_type-1){
                    for (int l = clients; l <clients+ 1; l++) {
                        passenger[l] = new Passenger(String.valueOf(names[generate.nextInt(100)]),
                                String.valueOf(surnames[generate.nextInt(100)]),
                                String.valueOf(numbers[generate.nextInt(numbers.length)]));
                        PassengerArray.add(passenger[l]);
                    }
                }
                radio = false;
            }

            if (day % 182 == 0 && moneyType > 100000){
                int priceCar = getRandomNumberInRange(60000, 99999);
                moneyType -= priceCar;
                System.out.println(mechanic1.getName() + " and "+ mechanic2.getName()+
                        " are trying to repair the broken cars.");
                for(int i=0; i<3; i++){
                    CarArray.get(getRandomNumberInRange(0, CarArray.size())).works(false);
                    mechanic1.repairs(String.valueOf(CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)))
                            ,String.valueOf(models[generate.nextInt(models.length)]),
                            String.valueOf(types[generate.nextInt(types.length)]));
                    CarArray.get(getRandomNumberInRange(0, CarArray.size())).works(false);
                    mechanic2.repairs(String.valueOf(CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)))
                        ,String.valueOf(models[generate.nextInt(models.length)]),
                        String.valueOf(types[generate.nextInt(types.length)]));
                }
                System.out.println("The cars that couldn't be repaired have been replaced by new ones.");
                System.out.println(getRandomNumberInRange(1, 3)+" new cars have been added to auto park.");
            }

                System.out.println("Money profit of the day is " + (MoneyDay-MoneyFuel));
                System.out.println("Money company has " + String.valueOf(moneyType));

            if (day == dir_die){
                System.out.println(director.getName() + " " + director.getSurname()+ " has died. " +
                        "His son decided to continue the family tradition.");
                vicedirector.runsTheBusiness();
            }
            if (day >= getRandomNumberInRange(dir_die+1, 100*365)){
                System.out.println(vicedirector.getName() + " " + vicedirector.getSurname()+ " has died. " +
                        "The daughter decided to sell the company and move to LA.");

                break;
            }

            day++;

/*


        FinancialAnalyst business1 = new FinancialAnalyst("Stela","Parker","Salary");
        System.out.println("1 salaries need to be set");
        System.out.println("2 road price needs to be set");
        System.out.println("3 salaries and road price need to be set");
        System.out.println("4 salaries and road price are already set");
        finType = fin.nextLine();
        if (finType.equals("1")) {
            FinancialAnalystArray.get(0).supports();
        if (finType.equals("4")) {
            System.out.println("Because the salaries and road prices are already set:");
            FinancialAnalystArray.get(0).study();
            FinancialAnalystArray.get(1).study();
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
}