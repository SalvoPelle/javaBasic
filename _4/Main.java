package exercise.javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 34;
        System.out.println("My age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char nameInitial = 'S';
        int myAge = 34;
        System.out.println("My age= " + myAge + ", my initial= " + nameInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Create a variable for checking if he had lunch
        boolean hasEatenLunch = false;
        // create a variable whit the cost of the lunch
        double lunchCost = 5.99;
        // print out the lunch cost
        System.out.println("Lunch cost=" + lunchCost);
        // print out if he had lunch
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
