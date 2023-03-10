package exercise.javabasics._13;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        //add new item
        numbers.add(5);
        numbers.add(56);
        numbers.add(4);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        numbers.add(65);
        numbers.add(98);

        System.out.println(numbers.get(0));

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);

        System.out.println(numbers.get(0));

    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 1:");
        //Write your code here

        //Create the Array list
        ArrayList<String> menuItems= new ArrayList<>();
        ArrayList<Double> menuPrice = new ArrayList<>();

        //Add itmes to the first Array
        menuItems.add("Carbonara");
        menuItems.add("Amatriciana");
        menuItems.add("Gricia");

        //Add item to the second Array
        menuPrice.add(12.50);
        menuPrice.add(11.00);
        menuPrice.add(9.50);
        // Print out the items of first Array corrispondet whit items fo second Array
        System.out.println("Our menù: " + menuItems.get(0) + " " + menuPrice.get(0) + " €" );
        System.out.println("          " + menuItems.get(1) + " " + menuPrice.get(1) + " €" );
        System.out.println("          " + menuItems.get(2) + " " + menuPrice.get(2) + " €" );

    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here

        // check the length for how to know how many items inside the array (length - 1)
        System.out.println(items.length);

        // Create an int for make the sum of the items
        int totalSum = items[0]+items[1]+items[2]+items[3]+items[4]+items[5]+items[6]+items[7]+items[8]+items[9];

        // print out the sum. i can do directly the sum here but i think that is cleaner like i made. it's right?
        System.out.println(totalSum);

    }
}
