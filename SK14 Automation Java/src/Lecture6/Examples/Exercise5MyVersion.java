package Lecture6.Examples;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a method named isEven that accepts an int argument. The method should return true if the
//argument is even, or false otherwise

public class Exercise5MyVersion {
    public static void main(String[] args) {
        isEven();
    }
        public static boolean isEven() {
        Scanner myObj = new Scanner(System.in);
            System.out.println("Please enter an int argument:");
            int x= myObj.nextInt();

            if (x%2  == 0) {
                return true;
            } else
                return false;
    }

}


