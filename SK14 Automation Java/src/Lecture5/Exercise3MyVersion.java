package Lecture5;

//Print elements of a given 2-d matrix with dynamic rows and columns taken from user input

import java.util.Scanner;

public class Exercise3MyVersion {
    public static void main(String[] args) {
        String[][] arr = new String[3][3];
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {

                Scanner myObj = new Scanner(System.in);
                System.out.println("Please enter some number");
                arr[i][j] = myObj.nextLine();
            }
        }

        System.out.println(arr[0][0] + " " + arr[0][1] + " " + arr[0][2]);
        System.out.println(arr[1][0] + " " + arr[1][1] + " " + arr[1][2]);
        System.out.println(arr[2][0] + " " + arr[2][1] + " " + arr[2][2]);
    }
}
