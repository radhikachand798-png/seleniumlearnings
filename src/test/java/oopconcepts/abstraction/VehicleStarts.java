package oopconcepts.abstraction;

abstract class VehicleStarts {
    public static void main(String[] args) {
        Vehicles bike= new Bike();
        Vehicles truck= new Truck();

        bike.start();
        truck.start();
    }
}
