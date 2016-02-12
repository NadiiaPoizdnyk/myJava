package strings;

import java.util.Scanner;

/**
 * The user enter 3 words, the program sorts them in alphabetical order.
 */
public class CompareTo {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String a[] = new String[3];
        System.out.println("Type a word:");
        a[0] = sc.nextLine();
        System.out.println("Type a word:");
        a[1] = sc.nextLine();
        System.out.println("Type a word:");
        a[2] = sc.nextLine();
        sc.close();

        for (int j = 0; j < a.length; j++){
            for (int i = j + 1; i < a.length; i++ ){
                if (a[i].compareTo(a[j]) < 0){             // methods of the String class, compareTo
                    String helper = a[j];
                    a[j] = a[i];
                    a[i] = helper;
                }
            }
            System.out.println(a[j]);
        }
    }
}
