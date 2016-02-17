import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Guess the value from the array [0-20] - type in
 * 2. print out the choice
 * 3. create the array (size - 21) and fill in it with numbers ([0-17]) randomly
 * 4. print out the array
 * 5. if you have guessed the number: print out the position of it in the array and the message "Congratulations!!!"
 * 6. if you have not guessed the number: print out the message "Sorry :( You did not guess."
 */
public class ArrayAndLoopsTaskGuessTheNumberFromArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = 0, index = 0;
        boolean found = false;
        String string = null;
        Pattern pattern = Pattern.compile("[0-9]{1}|[1]{1}[0-9]{1}|[2]{1}[0]{1}");
        Matcher matcher = null;


        do {
            System.out.print("Guess the value from the array [0-20]: ");
            string = scanner.nextLine();
            matcher = pattern.matcher(string);
            if (!matcher.matches()) System.out.println("Error! Invalid value has been entered! Try again ");

        } while (!matcher.matches());

        System.out.println("Your choice is: " + string);
        System.out.println("\nARRAY: ");
        value = Integer.parseInt(string);

        int[] array = new int[21];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 18);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                index++;
                if (array[i] == value) {
                    System.out.println("Your choice has the " + index + " position in the array.");
                    found = true;
                }
            }
        }
        if (found == true) {
            System.out.println("Congratulations!!!");
        } else {
            System.out.println("Sorry :( You did not guess.");
        }
    }
}
