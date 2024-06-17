package Lecture5;

//Find sum of the diagonal of a given 2d matrix with 4 rows and 4 columns

public class Exercise6MyVersion {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
//        Second solution:
//        int sumDiag = arr[0][0] + arr[1][1] + arr[2][2] + arr[3][3];
//        System.out.println(sumDiag);

        int i;
        int j;
        int sum = arr [0][0];
        for (i=1; i<arr.length; i++) {
            for(j=1; j<arr.length;j++) {
                if (i == j) {
                    System.out.println(sum = sum + arr[i][j]);
                }
            }
        }
    }
}



