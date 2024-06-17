package Lecture6.Examples;

//Write a Java method to compute the average of three numbers.

public class Exercise2MyVersion {
    public static void main(String[] args) {
        computeTheAverage();
    }
    public static void computeTheAverage() {
        int [] numbers = {6,12,10};
        int avg;
        int sum = numbers[0]+numbers[1]+numbers[2];
        avg = sum/numbers.length;
        System.out.println(avg);
    }
}

