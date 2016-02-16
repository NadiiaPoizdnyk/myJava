package arrays.intExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** The user types a number from 1 to 9.
 * The program creates an array whose size = the number, entered by the user,
 * fills it randomly and displays the array.
 */
public class ArrayEqualsNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 0;
        String s = null;
        Pattern pattern = Pattern.compile("[1-9]{1}");
        Matcher matcher = null;

//exceptions for: 1)special signs; 2)empty value; 3)letters; 4)whitespace + letter/numbers
        do {
            System.out.print("Type a number from 1 to 9: ");
            s = sc.nextLine();
            matcher = pattern.matcher(s);
            if (!matcher.matches()) System.out.println("Sorry! Invalid value has been entered");

        } while (!matcher.matches());

        number = Integer.parseInt(s);
        System.out.print("ARRAY: ");

        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i]);
            if (i == (number - 1)) {
                System.out.print(".");
            } else {
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
