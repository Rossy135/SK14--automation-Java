package Lecture4;

// Write a program to print the days of the week based on the user digit 1-7 input

import java.util.Scanner;

public class Exercise1MyVersion {
    public static void main(String args[]) {
        int i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a day of the week as numer");
        i = myObj.nextInt();

        switch (i) {
            case 1:
                System.out.println("The 1-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The 2-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The 3-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The 4-th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The 5-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The 6-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The 7-th day of the week is Sunday");
                break;
            default:
                System.out.println("Please enter a valid value!");
        }

    }
}
