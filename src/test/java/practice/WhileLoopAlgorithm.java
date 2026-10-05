package practice;

import java.util.Scanner;

public class WhileLoopAlgorithm {
    public static void main(String[] args) {

        int hourRate=15;
        int hour=40;

        System.out.println("enter the number of weekly hours work");
        Scanner input= new Scanner(System.in);
        double hourWorked=input.nextDouble();

        while( hourRate>40 ||hourWorked<1) {
            System.out.println("over time is not allowed.Working hours is up to 40.please re-enter total hours worked");
            hourWorked= input.nextDouble();
        }
        double totalPay= hourRate*hourWorked;
        System.out.println("Weekly pay=$ "+totalPay);

    }
}
