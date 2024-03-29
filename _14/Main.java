package exercise.javabasics._14;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        //exercise1();
        exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // Write your code for 1a here

        for (int i: itemsA) {
            sumForA += i;
        }
        System.out.println("The sum is= " + sumForA);

        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // Write your code for 1b here

        for (int j : itemsB) {
            sumForB += j;
        }

        System.out.println("The sum is= " + sumForB);

        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        // Write your code for 1c here, refer back to the lesson to check the fori syntax

        for (int k=0; k<itemsA.size(); k++){
            sumForC = sumForC + itemsA.get(k);
        }

        System.out.println("The sum is= " + sumForC);

        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);// ogni numero equivale alla grandezza di un array(se ho capito bene).
        int minNumber = Integer.MAX_VALUE;// non ho capito a cosa serve questa variabile instanziata così
        int maxNumber = 0;
        System.out.println("Exercise 2");
        // Write code here

        for (int i : items) {
            if (i < minNumber){
                minNumber = i;
            }
            if (i > maxNumber) {
                maxNumber = i;
            }
        }

            System.out.println("The minimum number is= " + Math.min(minNumber, maxNumber));
            System.out.println("The maximum number is= " + Math.max(minNumber, maxNumber));
            // sono arrivato al risultato ma non mi è molto chiaro l'utilizzo dell'index in questo esercizio. forse perchè provavo a farlo come in js...

        // System.out.println(minNumber); 2.147.483.647
    }

    /**
     * 3: Edit the fori loop below so it only prints the first 2 names.
     */
    private static void exercise3() {
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        System.out.println("Exercise 3");

        for (
                int index = 0;
                index < 2; // <---- Edit this line. HO DECISO DI CAMBIARE DIRETTAMENTE L'INDEX PERCHè RICHIEDE I PRIMI 2. AVREI POTUTO SOTTRARRE LE POSIZIONI MA QUESTO FUNZIONA SOLO QUANDO
                index = index + 1   // SAPPIAMO QUNATE POSIZIONI CI SONO NELL'ARRAY
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     *      https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        System.out.println("Exercise 4");

        for (
                int timesTableCurrentValue = 8; // <---- Edit this line
                timesTableCurrentValue <= 80; // <---- Edit this line
                timesTableCurrentValue = timesTableCurrentValue + 8 // <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue);
        }

        int numberToTimes = 3;

        for (
                int timesTableCurrentValue1 = numberToTimes; // <---- Edit this line
                timesTableCurrentValue1 <= (numberToTimes*10); // <---- Edit this line
                timesTableCurrentValue1 += numberToTimes // <---- Edit this line
        ) {
            System.out.println(timesTableCurrentValue1);
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     *
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     *
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        System.out.println("Exercise 5");


        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {
            // Your fori loop here

            System.out.println("");
            System.out.print(timesTableNumber + " = ");
            for (int i = 1; i <= 10; i++) {// crea un'altra serie di numeri da 1 a 10

                int results = (timesTableNumber*i);
                String newResults = String.valueOf(results);

                if (i<=9){
                    newResults = newResults+",";
                }

                if (timesTableNumber == 1) {
                    System.out.print(newResults);
                } else if (timesTableNumber == 2) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 3) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 4) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 5) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 6) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 7) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 8) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 9) {
                    System.out.print(newResults);
                }else if (timesTableNumber == 10) {
                    System.out.print(newResults);
                }

                // riesco a stampare ma non riesco a togliere l'ultima virgola. sicuramente esiste sia un metdo per inserire la virgola sia uno per togliere l'ultima ma non l'ho trovato

                //System.out.println(timesTableNumber + "x" + i +"=" + (timesTableNumber*i));
            }


        }
    }
}
