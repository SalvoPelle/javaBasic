package exercise.javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        String ourNumberStr = "88";
        //Write your code here
        int ourNumberInt = Integer.valueOf(ourNumberStr); // converted string in to an integer
        ourNumberInt = ourNumberInt +2;// increase by two
        String newNumberStr = String.valueOf(ourNumberInt);// converted int in to an String

        System.out.println(newNumberStr);// resul 90

        //PROVA MIA
        String myNumberStr = "88";
        int myNumberInt = Integer.valueOf(myNumberStr);// converted string in to an integer

        System.out.println("prova = " + String.valueOf(myNumberInt + 2));// converted int in to an String and increase by two

    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");
        char ourChar = 'a';
        String ourCharString = String.valueOf(ourChar).toUpperCase(); // <--- Change this line: CONVERTED IN TO STRING AND APPLY TOUPPERCAE METHOD
        // Notice below what happens, the `charAt()` method
/*37*/  System.out.println(ourCharString.charAt(0));// il metodo chatAt indica la posizione del carattere nella stringa. se lo togliamo stamperà comunque A perchè è l'unico valore

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";
        int charAtIndex = 6; // <--- Change this line
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
        //qui abbiamo inserito l'index 6 perchè la lettera w si trova nella posizione 6 partendo a contare da 0(come si contano le posizioni negli array).
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String intStrToConvert = "5"; // Change this line
        System.out.println(Integer.valueOf(intStrToConvert));

        String booleanStrToConvert = "false"; // And this line
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        String doubleStrToConvert = "6.7"; // Also this line
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     *    4.1: use a string method to make sure it can convert to an int and convert it to an int
     *    4.2: Times our number by 2
     *    4.3: Convert back to a string, and concatenate our number with itself,
     *         (i.e. 4 concatenated with itself is 44, not 8)
     *    4.4: Convert to a double and divide our number by 3.5
     *    4.5: Use Math.floor to remove decimal places on our number
     *
     *    Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String startStr = "5 ";
        // Write your code here
        int startInt = Integer.valueOf(startStr.trim());// converted in to a int and use trim method to eliminate space
        startInt *= 2;// time int by 2
        String newStartStr = String.valueOf(startInt);// converted in to a string
        newStartStr = newStartStr + newStartStr;// concatenate the string
        double startDouble = Double.valueOf(newStartStr);// converted in to a double
        startDouble /= 3.5;// divided by 3.5
        System.out.println(Math.floor(startDouble));// print out the result and apply Math.floor method to remove decimal
    }
}