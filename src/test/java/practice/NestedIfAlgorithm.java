package practice;

import java.util.Scanner;

public class NestedIfAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the annual income");
        double income = sc.nextDouble();

        System.out.println("enter years at current job");
        int year = sc.nextInt();

        if (income >= 30000) {
            if (year >= 2) {
                System.out.println("you are qualify for the loan");
              } else {
                System.out.println("you are not qualify. you must work for at least 2 years");
            }
            } else{
                System.out.println("you are not qualify. less salary");
            }

        }
    }