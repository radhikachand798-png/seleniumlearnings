package basicprogram;

import java.util.Scanner;

public class Multiplication {
   public static void main(String[] args) {
       Scanner radha = new Scanner(System.in);

       System.out.println("enter the first number: ");
       int numberOne = radha.nextInt();

       System.out.println("enter the second number: ");
       int numberTwo = radha.nextInt();

       int result = numberOne*numberTwo;
       System.out.println(result);

       radha.close();


    }



}
