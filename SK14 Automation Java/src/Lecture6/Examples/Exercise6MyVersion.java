package Lecture6.Examples;

//A takes as input a non-negative integer and returns true if the number is a palindrome;
//Non-negative integer is called a palindrome if it reads forward and backward in the same way. For
//example, the numbers 5, 121, 3443, and 123454321 are palindrom

public class Exercise6MyVersion {
    public static void main(String[] args) {
        isPalindrome();
    }
    public static void isPalindrome() {
        int [] numbers = {1, 6, 17, 121, -4, 1234321, 989};
        int i;
        for (i=0; i<numbers.length; i++) {
            if(numbers[i] < 0) {
                System.out.println("Number " + numbers[i] + " is negative. Please enter a positive integer");
            } else if (numbers[i]<=9) {
                    System.out.println("The number " + numbers[i] + " is a palindrome");
                } else {

            String reversedStr = "";
            String originalStr = String.valueOf(numbers[i]);
                originalStr = String.valueOf(Integer.parseInt(originalStr));


      for (int j = 0; j < originalStr.length(); j++) {
          reversedStr = originalStr.charAt(j) + reversedStr;
          System.out.println(reversedStr);

          if (originalStr.equals(reversedStr)) {
              System.out.println("The number " + originalStr + " is palindrome");
            }
      }
            }
        }
    }
}

