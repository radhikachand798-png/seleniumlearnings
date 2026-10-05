package javabasics;

import java.util.Scanner;

public class CalculatePay {
     public static void main(String [] args){

         Scanner some = new Scanner(System.in);

        System.out.println("please enter the first hours worked: ");
        double hoursNumber = some.nextDouble();

        System.out.println("please enter the second hourly pay rate: ");
        double payRate = some.nextDouble();

        double calculatePay = hoursNumber*payRate;
        System.out.println(calculatePay);

    }



}
