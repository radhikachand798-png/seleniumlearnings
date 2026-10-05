package practice;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCaseAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter a food items");
        String item= sc.nextLine();

        switch(item.toLowerCase()){
            case "pizza":
                System.out.println("price: 500");
                break;
            case "burger":
                System.out.println("price: 360");
                break;
            case "pasta":
                System.out.println("price: 200");
                break;
            case "momo":
                System.out.println("price: 150");
                break;
            default:
                System.out.println("food is not available");
        }
    }
}
