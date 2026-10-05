package practice;

import java.util.Scanner;

public class IfAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of sales");
        int sales= sc.nextInt();

        int payment=1000;

         if(sales>10){
            payment= payment + 250;

        }
         System.out.println("you will get "+payment);

    }
}
