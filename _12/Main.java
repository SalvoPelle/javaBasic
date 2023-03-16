package exercise.javabasics._12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);
    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     *
     *    Start with a base score of the string's length, this is the starting score. Use .length() on a string
     *
     *    The Maximum starting score is 20, if a score is over 20. Set it to 20.
     *
     *    If the string contains the letter a, -5 from the score
     *
     *    If the string is all lowercase, add 10 to the score.
     *
     *    If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;

        // Start your code here

        // Set the score to length
        yourScore = text.length();
        System.out.println(text.length());
        // Set if the score is greater than 20 assign 20.
        if (yourScore > 20) { // set the score maximun 20
            yourScore = 20;
        }

        // Set if contain a take of 5 point. FUNZIONA PERCHè SOLO LA PRIMA FRASE RISPETTA LE CONDIZIONI IMPOSTATE. ANDREBBE MESSO FUORI. spostato dopo
        if (text.contains("a")) {
            yourScore -= 5;
        }
        // ho provato a nestarli come sopra ma non funziona. Perchè
        if (text.equals(text.toLowerCase())) {// set 10 point more if is all to lower case
            yourScore += 10;
        }

        if (yourScore > 20){// set if the score is greater than 20 times by 2
            yourScore *=2;
        }

        // cercato il metodo per controllare se la stringa è tutta in minuscolo.
        //String str = "know program";
        //      if (str.equals(str.toLowerCase())) {
        //         System.out.println("Lowercase");
        //      } else {
        //         System.out.println("Not Lowercase");
        //      }


        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourScore;
    }




    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     *
     *    For the meal type sandwich calculate score like the following: 5 * weight
     *
     *    For the meal type of soup calculate score like the following 3 * weight
     *
     *    The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;
        // Start your code here

        // questi dati potrebbero essere inutili. li ho aggiunti per avere maggior chiarezza per me
        int multipleScoreSandwich = 5;
        int multipleScoreSoup = 3;

        if ( mealType.equals("sandwich") ){// if mealType is sandwich times by 5
            yourMealScore = multipleScoreSandwich * weight;
        }

        if ( mealType.equals("soup")){ // if mealType is soup times by 3
            yourMealScore = multipleScoreSoup * weight;
        }

        if (yourMealScore < 5) { // if the score is lower than 5 increase by 5. PUO' ANDARE ANCHE FUORI SENZA RIPETERLO ANCHE SOTTO.
            yourMealScore = 5;
        }
        // End it here

        System.out.print("Expected score=" + expectedScore +", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType +"'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}
