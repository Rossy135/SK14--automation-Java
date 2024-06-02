package Lecture5;

//Write program to print sum of a given array elements

public class Exercise1MyVersion {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int i;
        int s = arr[0];

        for (i = 1; i < arr.length; i++) {

            s=s+arr[i];
            System.out.println(s);
        }
    }
}
