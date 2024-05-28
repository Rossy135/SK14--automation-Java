package Lecture4;

import java.util.Scanner;

public class Exercise5MyVersion {
    public static void main(String[] args) {
        int beachBudget;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Where do you want to go to vacation = Beach or Mountain?");
        String vacationType = myObj.nextLine();

        if (vacationType.equals("Beach")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Please enter your budget!");
            beachBudget = myObj1.nextInt();
            if (beachBudget<50) {
                System.out.println("Your destination is Bulgaria");  }
                    else System.out.println("Outside Bulgaria");

                }
        else if (vacationType.equals("Mountain")) {
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Please enter your budget!");
            beachBudget = myObj2.nextInt();
        {
            if (beachBudget < 30) {
                System.out.println("Your destination is Bulgaria");
            } else System.out.println("Outside Bulgaria");}
        } else System.out.println("There is no information about this type of vacation");
    }

}
