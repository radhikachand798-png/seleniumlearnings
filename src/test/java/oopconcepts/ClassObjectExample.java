package oopconcepts;

public class ClassObjectExample {
    public void sum(){
        int a= 6;
        int b= 8;
        int sum = a+b;

        System.out.println("the result is :"+sum);

    }
    public static void main(String[] args) {
        ClassObjectExample obj_name= new ClassObjectExample();
        obj_name.sum();


    }
}
