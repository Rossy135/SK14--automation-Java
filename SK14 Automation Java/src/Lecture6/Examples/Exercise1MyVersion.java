package Lecture6.Examples;

//Write a Java method to find the smallest number among three numbers

public class Exercise1MyVersion {

    public static void main(String[] args) {
        findSmallest();
    }

        public static void findSmallest() {
            int[] numbers = {40, 20, 4};
            int i;
            int smallest = numbers[0];
            {
                for (i = 1; i < numbers.length; i++) {
                    if (numbers[i] < smallest) {
                        smallest = numbers[i];

                    }
                }
                System.out.println("The smallest number is: " + smallest);


            }

    }
}






