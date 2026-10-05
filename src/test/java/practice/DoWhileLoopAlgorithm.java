package practice;


import java.util.Scanner;

public class DoWhileLoopAlgorithm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char choice;

        do{
            System.out.println("enter the first number: ");
            int num1= sc.nextInt();
            System.out.println("enter the second number: ");
            int num2= sc.nextInt();

            int sum= num1 + num2;
            System.out.println("Sum= "+sum);

            System.out.println("do you want to continue? : ");
            choice= sc.next().charAt(0);

        } while(choice=='y');
        System.out.println("program ended.");


    }
}
