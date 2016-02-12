package strings;

import java.util.Scanner;

public class Equals {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String target = "accumulator";
        System.out.println("There are some errors in the word 'acamulator' Please correct these errors.");
        System.out.println("Type a word:");
        String word = sc.nextLine();
        sc.close();

        if (word.equals(target)){                           // methods of the String class, equals
            System.out.println(word + " correctly");
        } else {
            System.out.println(word + " wrong");
        }
    }
}
