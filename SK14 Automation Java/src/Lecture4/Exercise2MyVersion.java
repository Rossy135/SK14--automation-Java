package Lecture4;

// Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible
//to work

import java.util.Scanner;

public class Exercise2MyVersion {
    public static void main(String[] args) {
        int i;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your age!");
        i = myObj.nextInt();
        if (i >= 16) {
            System.out.println("You are eligible to work");
        } else {
                System.out.println("You are not eligible to work");
            }
        }
    }
