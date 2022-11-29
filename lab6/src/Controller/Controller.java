package Controller;

import Model.*;
import View.View;

import java.util.List;
import java.util.Random;

public class Controller {
    private Car[] car;
    private Director director;
    private Director vicedirector;
    private FinancialAnalyst business1;
    private FinancialAnalyst business2;
    private Rectruiter hr;
    private Driver[] driver;
    private Passenger[] passenger;
    private Developer it1;
    private Developer it2;
    private ServicePromoter marketing1;
    private ServicePromoter marketing2;
    private ServicePromoter marketing3;
    private Operator operator1;
    private Operator operator2;
    private Operator operator3;
    private Mechanic mechanic1;
    private Mechanic mechanic2;
    private View view;

    public Controller(Car[] car,Director director,Director vicedirector,FinancialAnalyst business1,FinancialAnalyst business2,
                      Rectruiter hr,Driver[] driver, Passenger[] passenger, Developer it1, Developer it2,
                      ServicePromoter marketing1,ServicePromoter marketing2, ServicePromoter marketing3,
                      Operator operator1, Operator operator2, Operator operator3, Mechanic mechanic1,
                      Mechanic mechanic2, View view){
        this.car = car;
        this.director = director;
        this.vicedirector = vicedirector;
        this.business1 = business1;
        this.business2 = business2;
        this.hr = hr;
        this.driver = driver;
        this.passenger = passenger;
        this.it1 = it1;
        this.it2 = it2;
        this.marketing1 = marketing1;
        this.marketing2 = marketing2;
        this.marketing3 = marketing3;
        this.operator1 = operator1;
        this.operator2 = operator2;
        this.operator3 = operator3;
        this.mechanic1 = mechanic1;
        this.mechanic2 = mechanic2;
        this.view = view;
    }
    // car
    /////////
    public String getRandomCarModelName (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getModel_name();
    }
    public String getRandomCarType (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getType();
    }
    public String getRandomCarPrice (List<Car> CarArray){
        return CarArray.get(getRandomNumberInRange(0, CarArray.size()-1)).getPrice();
    }
    /////////
    public void setCarModel(String model, int i){
        car[i].setModel_name(model);
    }
    public String getCarModel(int i){
        return car[i].getModel_name();
    }
    public void setCarType(String type, int i){
        car[i].setType(type);
    }
    public String getCarType(int i){
        return car[i].getType();
    }
    public void setCarPrice(String price, int i){
        car[i].setPrice(price);
    }
    public String getCarPrice(int i){
        return car[i].getPrice();
    }
    // director
    public void setDirectorName(String name){
        director.setName(name);
    }
    public String getDirectorName(){
        return director.getName();
    }
    public void setDirectorSurname(String surname){
        director.setSurname(surname);
    }
    public String getDirectorSurname(){
        return director.getSurname();
    }
    // vicedirector
    public void setVicedirectorName(String name){
        vicedirector.setName(name);
    }
    public String getVicedirectorName(){
        return vicedirector.getName();
    }
    public void setVicedirectorSurname(String surname){
        vicedirector.setSurname(surname);
    }
    public String getVicedirectorSurname(){
        return vicedirector.getSurname();
    }
    // business1
    public void setBusiness1Name(String name){
        business1.setName(name);
    }
    public String getBusiness1Name(){
        return business1.getName();
    }
    public void setBusiness1Surname(String surname){
        business1.setSurname(surname);
    }
    public String getBusiness1Surname(){
        return business1.getSurname();
    }
    public void setBusiness1Role(String role){
        business1.setRole(role);
    }
    public String getBusiness1Role(){
        return business1.getRole();
    }
    // business2
    public void setBusiness2Name(String name){
        business2.setName(name);
    }
    public String getBusiness2Name(){
        return business2.getName();
    }
    public void setBusiness2Surname(String surname){
        business2.setSurname(surname);
    }
    public String getBusiness2Surname(){
        return business2.getSurname();
    }
    public void setBusiness2Role(String role){
        business2.setRole(role);
    }
    public String getBusiness2Role(){
        return business2.getRole();
    }
    // hr
    public void setHrName(String name){
        hr.setName(name);
    }
    public String getHrName(){
        return hr.getName();
    }
    public void setHrSurname(String surname){
        hr.setSurname(surname);
    }
    public String getHrSurname(){
        return hr.getSurname();
    }
    // driver
    /////////
    public String getRandomDriverName (List<Driver> DriverArray){
        return DriverArray.get(getRandomNumberInRange(0, DriverArray.size()-1)).getName();
    }
    /////////
    public void setDriverName(String name, int i){
        driver[i].setName(name);
    }
    public String getDriverName(int i){
        return driver[i].getName();
    }
    public void setDriverSurname(String surname, int i){
        driver[i].setSurname(surname);
    }
    public String getDriverSurname(int i){
        return driver[i].getSurname();
    }
    public void setDriverAge(int age, int i){
        driver[i].setAge(age);
    }
    public int getDriverAge(int i){
        return driver[i].getAge();
    }
    public void setDriverDrivingAge(int driving_age, int i){
        driver[i].setDriving_age(driving_age);
    }
    public int getDriverDrivingAge(int i){
        return driver[i].getDriving_age();
    }
    public void setDriverRoKnowledge(boolean know_ro_lang, int i){
        driver[i].setKnow_ro_lang(know_ro_lang);
    }
    public boolean getDriverRoKnowledge(int i){
        return driver[i].isKnow_ro_lang();
    }
    public void setDriverRuKnowledge(boolean know_ru_lang, int i){
        driver[i].setKnow_ru_lang(know_ru_lang);
    }
    public boolean getDriverRuKnowledge(int i){
        return driver[i].isKnow_ru_lang();
    }
    public void setDriverEnKnowledge(boolean know_en_lang, int i){
        driver[i].setKnow_en_lang(know_en_lang);
    }
    public boolean getDriverEnKnowledge(int i){
        return driver[i].isKnow_en_lang();
    }
    public void setDriverWorkExperience(int work_exp, int i){
        driver[i].setWork_exp(work_exp);
    }
    public int getDriverWorkExperience(int i){
        return driver[i].getWork_exp();
    }
    //passenger
    /////////////////
    public String getRandomPassengerPhoneNumber(List<Passenger> PassengerArray) {
        return PassengerArray.get(getRandomNumberInRange(0, PassengerArray.size() - 1)).getPhone_number();
    }
    /////////////////
    public void setPassengerName(String name, int i){
        passenger[i].setName(name);
    }
    public String getPassengerName(int i){
        return passenger[i].getName();
    }
    public void setPassengerSurname(String surname, int i){
        passenger[i].setSurname(surname);
    }
    public String getPassengerSurname(int i){
        return passenger[i].getSurname();
    }
    public void setPassengerPhoneNumber(String phone_number, int i){
        passenger[i].setPhone_number(phone_number);
    }
    public String getPassengerPhoneNumber(int i){
        return passenger[i].getPhone_number();
    }
    public void setPassengerSatisfaction(boolean happy, int i){
        passenger[i].setHappy(happy);
    }
    public boolean getPassengerSatisfaction(int i){
        return passenger[i].isHappy();
    }
    // it1
    public void setIt1Name(String name){
        it1.setName(name);
    }
    public String getIt1Name(){
        return it1.getName();
    }
    public void setIt1Surname(String surname){
        it1.setSurname(surname);
    }
    public String getIt1Surname(){
        return it1.getSurname();
    }
    public void setIt1Role(String role){
        it1.setRole(role);
    }
    public String getIt1Role(){
        return it1.getRole();
    }
    // it2
    public void setIt2Name(String name){
        it2.setName(name);
    }
    public String getIt2Name(){
        return it2.getName();
    }
    public void setIt2Surname(String surname){
        it2.setSurname(surname);
    }
    public String getIt2Surname(){
        return it2.getSurname();
    }
    public void setIt2Role(String role){
        it2.setRole(role);
    }
    public String getIt2Role(){
        return it2.getRole();
    }
    // marketing1
    public void setMarketing1Name(String name){
        marketing1.setName(name);
    }
    public String getMarketing1Name(){
        return marketing1.getName();
    }
    public void setMarketing1Surname(String surname){
        marketing1.setSurname(surname);
    }
    public String getMarketing1Surname(){
        return marketing1.getSurname();
    }
    // marketing2
    public void setMarketing2Name(String name){
        marketing2.setName(name);
    }
    public String getMarketing2Name(){
        return marketing2.getName();
    }
    public void setMarketing2Surname(String surname){
        marketing2.setSurname(surname);
    }
    public String getMarketing2Surname(){
        return marketing2.getSurname();
    }
    // marketing3
    public void setMarketing3Name(String name){
        marketing3.setName(name);
    }
    public String getMarketing3Name(){
        return marketing3.getName();
    }
    public void setMarketing3Surname(String surname){
        marketing3.setSurname(surname);
    }
    public String getMarketing3Surname(){
        return marketing3.getSurname();
    }
    ////////////
    public String getRandomOperatorName (List<Operator> OperatorArray) {
        return OperatorArray.get(getRandomNumberInRange(0, OperatorArray.size() - 1)).getName();
    }
    ////////////
    // operator1
    public void setOperator1Name(String name){
        operator1.setName(name);
    }
    public String getOperator1Name(){
        return operator1.getName();
    }
    public void setOperator1Surname(String surname){
        operator1.setSurname(surname);
    }
    public String getOperator1Surname(){
        return operator1.getSurname();
    }
    public void setOperator1Availability(boolean response){
        operator1.setResponse(response);
    }
    public boolean getOperator1Availability(){
        return operator1.isResponse();
    }
    // operator2
    public void setOperator2Name(String name){
        operator2.setName(name);
    }
    public String getOperator2Name(){
        return operator2.getName();
    }
    public void setOperator2Surname(String surname){
        operator2.setSurname(surname);
    }
    public String getOperator2Surname(){
        return operator2.getSurname();
    }
    public void setOperator2Availability(boolean response){
        operator2.setResponse(response);
    }
    public boolean getOperator2Availability(){
        return operator2.isResponse();
    }
    // operator3
    public void setOperator3Name(String name){
        operator3.setName(name);
    }
    public String getOperator3Name(){
        return operator3.getName();
    }
    public void setOperator3Surname(String surname){
        operator3.setSurname(surname);
    }
    public String getOperator3Surname(){
        return operator3.getSurname();
    }
    public void setOperator3Availability(boolean response){
        operator3.setResponse(response);
    }
    public boolean getOperator3Availability(){
        return operator3.isResponse();
    }
    // mechanic1
    public void setMechanic1Name(String name){
        mechanic1.setName(name);
    }
    public String getMechanic1Name(){
        return mechanic1.getName();
    }
    public void setMechanic1Surname(String surname){
        mechanic1.setSurname(surname);
    }
    public String getMechanic1Surname(){
        return mechanic1.getSurname();
    }
    public void setMechanic1Age(int age){
        mechanic1.setAge(age);
    }
    public int getMechanic1Age(){
        return mechanic1.getAge();
    }
    public void setMechanic1PhoneNumber(String phone_number, int i){
        mechanic1.setPhone_number(phone_number);
    }
    public String getMechanic1PhoneNumber(int i){
        return mechanic1.getPhone_number();
    }
    // mechanic2
    public void setMechanic2Name(String name){
        mechanic2.setName(name);
    }
    public String getMechanic2Name(){
        return mechanic2.getName();
    }
    public void setMechanic2Surname(String surname){
        mechanic2.setSurname(surname);
    }
    public String getMechanic2Surname(){
        return mechanic2.getSurname();
    }
    public void setMechanic2Age(int age){
        mechanic2.setAge(age);
    }
    public int getMechanic2Age(){
        return mechanic2.getAge();
    }
    public void setMechanic2PhoneNumber(String phone_number, int i){
        mechanic2.setPhone_number(phone_number);
    }
    public String getMechanic2PhoneNumber(int i){
        return mechanic2.getPhone_number();
    }

    private static int getRandomNumberInRange ( int min, int max){

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
