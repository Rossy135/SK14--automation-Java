package Lecture2;
import java.util.Scanner;
public class Exercise5MyVersion {
    public static void main(String[] args) {
        float p;
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Enter Side A");
        float SideA = MyObj.nextFloat();
        System.out.println("Enter Side B");
        float SideB = MyObj.nextFloat();
        System.out.println("Enter Side C");
        float SideC = MyObj.nextFloat();
        p = SideA + SideB + SideC;
        System.out.println("Perimeter = " + p);
    }
}
