package Lecture4;

public class Exercise4MyVersion {
    public static void main(String[] args){
        int [] arr ={2,11,45,9,18,93};
        int largest = arr[0];
        int i;

        for(i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
        }

}

