package decisionstructure;

import java.util.Enumeration;
import java.util.Scanner;

public class IfExample {
    public static void main(String [] args){
      /*
         if(condition){
                //code to be executed
                }
       */

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number:");
        int num = sc.nextInt();

         if(num==8){
            System.out.println("Please guess the correct number");

        }


    }
}
