package Lecture4;

import java.util.Scanner;

public class Exercise3MyVersion {
    public static void main(String[] args) {
        double unitPrice;
        int quantity;
        double revenue;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter unit price");
        unitPrice = myObj.nextDouble();
        System.out.println("Enter quantity");
        quantity = myObj.nextInt();

        if(quantity < 100) {
            revenue = quantity * unitPrice;
            System.out.println("The revenue from sale is : " + revenue + "$");
        }
        else if(quantity >= 100 && quantity <= 120) {
            revenue = quantity * unitPrice * 0.85;
            System.out.println("The revenue from sale is : " + revenue + "$");
        }
        else if(quantity > 120) {
            revenue = quantity * unitPrice * 0.80;
            System.out.println("The revenue from sale is : " + revenue + "$");
            }
                    }

            }





