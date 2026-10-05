package oopconcepts.inheritance;

public class SportsCar extends Car{
    private int topSpeed;

    public SportsCar(String brand, String model, int year, int topSpeed){
        super(brand,model,year);
        this.topSpeed=topSpeed;

    }
    public void displayTopSpeed(){
        System.out.println("the topspeed of the car is: "+topSpeed);
    }
    public static void main(String[] args) {
        SportsCar car1= new SportsCar("BYD", "honda", 2027, 80);
        car1.displayTopSpeed();
        car1.displayCar();
        System.out.println(car1.displayCar());
    }
}
