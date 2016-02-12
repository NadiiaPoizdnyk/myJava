package strings;

import java.util.Scanner;

public class Length {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String address;
        System.out.println("Type a word:");
        address = sc.nextLine();
        sc.close();

        int number = address.length();                     // methods of the String class, length()
        System.out.println("The length of the string is " + number);
    }
}
