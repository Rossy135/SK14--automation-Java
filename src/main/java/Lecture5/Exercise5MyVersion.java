package Lecture5;

//Reverse the order of the elements in a LinkedList using algorithm

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;

public class Exercise5MyVersion {
    public static void main(String[] args) {

    LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.reverse(cars);
        System.out.println(cars);
        }
}


