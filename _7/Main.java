package javabasics._7;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     *
     *    print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        //Write your code here
        // create a string whit name and surname
        // HO PROVATO AD INSERIRE I METODI DIRETTAMENTE ALLE STRINGHE PER VEDERE IL RISULTATO.
        String name = "Salvo".toUpperCase();        // apply toUpperCase (test)
        String surname = "Pellegrino".toLowerCase();// apply toLowerCase (test)


        //print out the string
        System.out.println(name);
        System.out.println(surname);

        // print out the string whit method toLowerCase in name and toUpperCase in surname
        System.out.println(name.toLowerCase());
        System.out.println(surname.toUpperCase());

        //DOMANDA: conviene usare i metodi solo nel sout o all'interno delle stringhe come fatto sopra?
    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "(Salvatore)";
        String middleName = "(Giovanni)";
        String lastName = "(Pellegrino)";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase()); // <--- Edit this line
    }


     /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     *
     * Use the '+' operator
     *
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     *
     * +
     *
     * Experiment with these different types, how do an int and a double behave when added?
     *
     * What about a boolean and an int?
      *
      * "" + 1.5
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String textFrom2Primitives = "Test " + 1 + " " + true + " " + 4.7 + " " + 'F'; // <--- Edit this line
        System.out.println(textFrom2Primitives);
    }


     /**
     * 4: Without editing the Strings below make the print statement print
     *
     *    1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     *
     *    You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers.trim() + " " + middleNumbers.trim() + " " + endNumbers.trim()); // <--- Write your code here
    }


}