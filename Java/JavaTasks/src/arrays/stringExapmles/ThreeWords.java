package arrays.stringExapmles;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** The user enters 3 words.
 * The program writes them into an array and prints 3 words.
 */
public class ThreeWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = null;
        Matcher matcher = null;
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,10}");


        String mas[] = new String[3];
        for (int i = 0; i < 3; i++) {

            while (matcher.matches()){
                System.out.println("Type a word: ");
                str = sc.nextLine();
                matcher = pattern.matcher(str);
                mas[i] = str;
                if (!matcher.matches()){
                    System.out.println("Error! Repeat your try. ");
                } else{
                    for (i = 0; i < 3; i++) {
                        System.out.print(mas[i] + " ");
                    }
                }
            }



            sc.close();
        }
    }
}