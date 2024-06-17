package Lecture5;

//Print elements of a given 2-d matrix with 4 rows and 3 columns

public class Exercise2MyVersion {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}

        };
        int i;
        int j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length-1; j++)

                System.out.println(arr[i][j]);
        }
    }
}

