package oopconcepts.inheritance;

public class Car {
    protected String brand;
    protected String model;
    protected int year;

    public Car(String brand, String model, int year){
        this.brand=brand;
        this.model=model;
        this.year=year;

    }
    public String displayCar(){
        return"The brand of the car is "+brand+", the model is "+model+" and the made in year is "+year;
    }
}
