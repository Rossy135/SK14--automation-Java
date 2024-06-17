package Lecture6.Examples;

//Write a Java method to display the middle character of a string.

import java.util.Scanner;

public class Exercise3MyVersion {
    public static void main(String[] args) {
        findMiddleCharacter();
    }
    public static void findMiddleCharacter() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = myObj.nextLine();
        int length = word.length();
        int index1;
        index1 = (length/2);
        if (length%2 == 0) {
            System.out.println(word.substring(index1-1,index1+1));
        }
        else {System.out.println(word.substring(index1,index1+1));
        }

    }

}
