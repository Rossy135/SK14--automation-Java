package Lecture2;

import java.util.Scanner;

public class Exercise6MyVersion {
    public static void main(String[] args) {
        float a;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side A");
        Float SideA = myObj.nextFloat();
        System.out.println("Enter h");
        Float h = myObj.nextFloat();
        a = (SideA*h)/2;
        System.out.println("Area =" + a);
    }
}
