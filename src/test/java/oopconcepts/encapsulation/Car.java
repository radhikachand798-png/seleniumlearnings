package oopconcepts.encapsulation;

public class Car {
   private String brand;
   private String model;
   private int year;

//   public Car(String brand, String mo, int yea){
//       this.brand=brand;
//       this.model=mo;
//       this.year=yea;
//
//   }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String carInformation(){
       return"The brand of rhe car is "+brand+", the model is "+model+" and the made in year is "+year;
   }
   public static void main(String[] args) {
       Car car1= new Car();
       car1.setBrand("BYD");
       car1.setModel("Dolphin");
       car1.setYear(2026);
       System.out.println(car1.carInformation());
       System.out.println(car1.getBrand());
       System.out.println(car1.getModel());
       System.out.println(car1.getYear());
   }
}
