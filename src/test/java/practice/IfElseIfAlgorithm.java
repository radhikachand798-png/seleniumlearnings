package practice;

import java.util.Scanner;

public class IfElseIfAlgorithm {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter test score");

        int score= sc.nextInt();

        if(score>=50){
            System.out.println("grade: A");
        }
        else if(score>=40){
            System.out.println("grade: B");
        }
        else if (score>=30){
            System.out.println("grade: C");
        }else{
            System.out.println("grade: D-");
        }
    }
}
