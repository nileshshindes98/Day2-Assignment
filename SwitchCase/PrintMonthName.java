package SwitchCase;
//Write a Program to print the month name for the given number

import java.util.Scanner;

public class PrintMonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Month: ");
        int num = scanner.nextInt();
        System.out.println("--------------------------");
        switch(num){
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3 :
                System.out.println("MARCH");
                break;
            case 4 :
                System.out.println("APRIL");
                break;
            case 5 :
                System.out.println("MAY");
                break;
            case 6 :
                System.out.println("JUN");
                break;
            case 7 :
                System.out.println("JULY");
                break;
            case 8 :
                System.out.println("AUG");
                break;
            case 9 :
                System.out.println("SEPT");
                break;
            case 10 :
                System.out.println("OCT");
                break;
            case 11 :
                System.out.println("NOV");
                break;
            case 12 :
                System.out.println("DEC");
                break;

            default:
                System.out.println("Please Enter right Month Number");
                System.out.println("Please enter number between 1 to 12");

                break;
        }
    }
}
