package practice;

import java.util.Scanner;

public class IfElseAlgorithm {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of sales");
        int salePeople= sc.nextInt();

        if(salePeople>=10) {
            System.out.println("congratulation! you got the target");
        }else{
            int shortSales= 10 - salePeople;
            System.out.println("you are shorted by " +shortSales );
        }
    }
}
