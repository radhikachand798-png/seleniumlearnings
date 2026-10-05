package decisionstructure;

import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        /*
        if(condition){
           if(condition){
              //code to be executed
              }
              }
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total present percentage");
        double percentage = sc.nextDouble();
        System.out.println("Did the student submit the project?(Enter either true or false input only)");
           boolean projectSubmitted = sc.nextBoolean();

//        if(percentage>=90){
//            System.out.println("Did the student submit the project?(Enter either true or false input only)");
//            boolean projectSubmitted = sc.nextBoolean();
//
//            if(projectSubmitted==true) {
//                System.out.println("you can get the certification");
//            }else{
//                System.out.println("you are not eligible for the certification");
//            }
//        }else{
//            System.out.println("
//            you are not eligible for the certification");
//        }

        if((percentage>=90) && projectSubmitted){
            System.out.println("you are not eligible for the certification");
           }
        else{
           System.out.println("you are not eligible for the certification");
        }
    }
}
