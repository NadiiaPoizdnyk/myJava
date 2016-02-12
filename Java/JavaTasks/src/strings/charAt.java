package strings;

import java.util.Scanner;

/** The user enters a name and a surname.
 * The program displays the 1st letter of the name and the surname.
 */
public class charAt {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String name, surname;
        System.out.println("Type a name: ");
        name = sc.nextLine();
        System.out.println("Type a surname: ");
        surname = sc.nextLine();
        sc.close();

        char ch = name.charAt(0);   // methods of the String class, charAt()
        String n = "" + ch + ".";

        System.out.println(n + " " + surname);
    }
}
