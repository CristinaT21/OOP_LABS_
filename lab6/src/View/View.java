package View;

import Model.*;

import java.util.*;

public class View {
    public static void simulationStart() {
        System.out.println("Welcome to " + TaxiCompany.CompanyName + "!");
    }
    public static void hrEvaluatesSkills(String name){
        System.out.println(name + " is evaluating the skills of all potential employees.");
    }
    public static void incompetentDrivers(List<String> i_list){
        System.out.println("The incompetent drivers for the job are: " + i_list);
    } 
    public static void hiredDrivers(List<Driver> DriverArray){
        System.out.println("The number of drivers hired is " + DriverArray.size());
    }
    public static void noMoney(){
        System.out.println("Company has no money to start the business. Cars are expensive");

    }
    public static void noClients(){
        System.out.println("The company is closed because of lack of clients.");
    }
    public static void assignCar(String name, String number, String model, String type, String price){
        System.out.printf("%s responds to %s and assigns the car %s %s %s.%n",
                name, number, model, type, price);
    }
    public static void driverInTraffic(String name){
        System.out.println(name + " is in traffic with another passenger.");
    }
    public static void driverOnWay(String name){
        System.out.println(name + " is on his way to the customer.");
    }
    public static void showHour(int day, int i){
        System.out.println("Day "+ day +", hour " + String.valueOf(i));
    }
    public static void NoClients(){
        System.out.println("The company is bankrupt because of lack of clients.");
    }
    public static void NoMoney(){
        System.out.println("The company is bankrupt because of lack of money.");
    }
    public static void noDrivers(){                   
        System.out.println("The company is bankrupt because of lack of drivers.");
    }
    public static void repairCars(String name1, String name2){
        System.out.println(name1+ " and "+ name2+
            " are trying to repair the broken cars.");
    }
    public static void brokenCars(){
        System.out.println("The cars that couldn't be repaired have been replaced by new ones.");
    }
    public static void carsAdded(){
        System.out.println(getRandomNumberInRange(1, 3)+" new cars have been added to auto park.");

    }
    public static void moneyProfit(float money){
        System.out.println("Money profit of the day is " + money);

    }
    public static void moneyCompany(String money) {
        System.out.println("Money company has " + money);
    }
    public static void directorDied(String name, String surname){
        System.out.println(name + " " + surname + " has died. " +
                "His son decided to continue the family tradition.");
    }
    public static void vicedirectorDied(String name, String surname){
        System.out.println(name+ " " + surname + " has died. " +
                "The daughter decided to sell the company and move to LA.");

    }

    private static int getRandomNumberInRange ( int min, int max){

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
