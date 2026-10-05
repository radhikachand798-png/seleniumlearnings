package decisionstructure;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        /*
        switch(condition){
           case x:
            //code to be executed
           break;
            case y:
             //code to be executed
             break;
            default:
             //code to be executed
             }

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the day of the week");
        String day = sc.nextLine();

//        int num = sc.nextInt();

//        switch(num){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break:
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Please enter the valid number from 1 to 7");
//
//        }

        switch(day.toLowerCase()){
            case"sunday":
                System.out.println("Sunday is the first day of the week");
                break;
            case"monday":
                System.out.println("Monday is the second day of the week");
                break;
            case"tuesday":
                System.out.println("Tuesday is the third day of the week");
                break;
            case"wednesday":
                System.out.println("Wednesday is the fourth day of the week");
                break;
            case"thursday":
                System.out.println("Thursday is the fifth day of the week");
                break;
            case"friday":
                System.out.println("Friday is the sixth day of the week");
                break;
            case"saturday":
                System.out.println("saturday is the seventh day of the week");
                break;
            default:
                System.out.println("please enter the valid day of the week");
        }
    }
}
