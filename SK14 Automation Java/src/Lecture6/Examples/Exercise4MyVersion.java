package Lecture6.Examples;

import java.util.Scanner;

//Write a Java method to count all words in a string.

public class Exercise4MyVersion {
    public static void main(String[] args) {
        countWords();
    }
    public static void countWords() {
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Please enter text here:");
        String text = myObj.nextLine();
        if (text== "") {
            System.out.println("There is no text");
        } else {
            final String[] words = text.split(" ");
            System.out.println(words.length);
        }

    }
}
