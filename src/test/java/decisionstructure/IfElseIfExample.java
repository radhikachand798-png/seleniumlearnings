package decisionstructure;

import java.util.Scanner;

public class IfElseIfExample {
   public static void main(String[] args) {
     /*
     if(condition){
         //code to be executed
      }else if(condition){
          // code to be executed
      }else if(condition){
            //code to be executed
       }else {
          //code to be executed
          }
       */
       Scanner sc = new Scanner(System.in);
       System.out.println("please enter the number of the day: ");
       int num = sc.nextInt();

       if(num==1){
           System.out.println("Today is Sunday");
       }else if(num==2){
           System.out.println("Today is Monday");
       }else if(num==3){
           System.out.println("Today is Tuesday");
       }else if(num==4){
           System.out.println("Today is Wednesday");
       }else if(num==5){
           System.out.println("Today is Thursday");
       }else if(num==6){
           System.out.println("Today is Friday");
       }else if(num==7){
           System.out.println("Today is Saturday");
       }else {
           System.out.println("please enter the valid number of the week that is 1to7");

       }
   }
}
