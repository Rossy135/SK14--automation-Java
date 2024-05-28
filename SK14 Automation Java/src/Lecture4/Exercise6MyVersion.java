package Lecture4;

public class Exercise6MyVersion {
    public static void main(String[] args) {
        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > 150) {
                break;}
            if (arr[i] % 5 == 0) System.out.println(arr[i]);

                }
        }
    }


