package practice;

import java.util.Scanner;

public class ForLoopAlgorithm {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter the number of items: ");
        int quantity= input.nextInt();
        int total= 0;

        for(int i=1; i<= quantity; i++);{
            System.out.println("enter price of item" + 'i' +": ");
            int price=input.nextInt();

            total=total+price;
        }
        System.out.println("Total cost = $" + total);
    }
}
