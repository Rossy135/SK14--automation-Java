package Lecture6;

import java.util.LinkedList;
import java.util.regex.Pattern;

//Write a program which validate whether given string is palindrome (A palindrome is a sequence of characters which reads
//the same backward as forward, such as madam or racecar) - not ready

public class Exercise7MyVersion {
    public static void main(String[] args) {
      LinkedList <String> words = new LinkedList<>();
      words.add("madam");
      words.add("sir");
      words.add("tomato");
      words.add("racecar");

//        String str= "Geeks", nstr="";
        String nstr="";
        char ch;
        String str = words.element();
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}


//int i;
//      String originalStr;
//      String reversedStr = "";
//
//      for (int j = 0; j < originalStr.length(); j++) {
//          reversedStr = originalStr.charAt(j) + reversedStr;
//          System.out.println(reversedStr);
//
//          if (originalStr == reversedStr) {
//              System.out.println("The word" + originalStr + "is palindrome");
//          }
//      }
//
//            }
//        }


