package oopconcepts.polymorphism;

public class AnimalFeatures {
    public static void main(String[] args) {
        Animal animal= new Animal();
        Animal dog =new Dog();
        Animal cat =new Cat();

        animal.speak();
        dog.speak();
        cat.speak();

    }
}
