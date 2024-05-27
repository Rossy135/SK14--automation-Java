package Lecture2;
import java.util.Scanner;

public class Exercise7MyVersion {
    public static void main(String[] args) {
        double OneEgg = 1.25;
        double SmallWater = 0.80;
        double PackOfWater = 6.00; // 6 x smallWater
        double PackOfEggs = 7.10; // 10 x eggs
        int bottlesOfWater;
        int NumberOfEggs;
        int pw;
        int pe;
        Double WaterCost;
        Double EggsCost;
        Double bill;

        Scanner myObj = new Scanner(System.in);
        System.out.println("How many eggs do you need?");
        byte eggs = myObj.nextByte();
        System.out.println("How many bottles of water do you need");
        byte water = myObj.nextByte();
        if (water >= 6) {
            pw = (water / 6);
            bottlesOfWater = water - (pw*6);
        }
        else {
            pw = 0;
            bottlesOfWater = water;
        }
        WaterCost = pw * PackOfWater + SmallWater * bottlesOfWater;
//        System.out.println(WaterCost);

        if (eggs >= 10) {
            pe = (eggs / 10);
            NumberOfEggs = eggs - (pe*10);
        }
        else {
            pe = 0;
            NumberOfEggs = eggs;
        }
        WaterCost = pw * PackOfWater + SmallWater * bottlesOfWater;
        EggsCost = pe * PackOfEggs + OneEgg * NumberOfEggs;
        bill = WaterCost + EggsCost;
        System.out.println("Your bill is: " + bill);
            }


            }

