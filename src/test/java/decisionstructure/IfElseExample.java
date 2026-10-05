package decisionstructure;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args){
        /*
        if(condition ){
                //code to be executed.
        }else{
               //code to be executed.
        }
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("please guess the number");
        int num = sc.nextInt();

        if(num==5){
            System.out.println("you guessed the correct number");
        }
        else{
            System.out.println("sorry you guessed the wrong number try again");
        }



    }
}
