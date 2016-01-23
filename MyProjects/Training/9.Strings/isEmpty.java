import java.util.Scanner;

/**
 * The program checks if the user entered any information or not.
 */
public class isEmpty {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Type a word or a phrase:");
        a = sc.nextLine();
        sc.close();

        if (a.isEmpty()){                      // methods of the String class, isEmpty()
            System.out.println("It's empty");
        } else {
            System.out.println(a);
        }
    }
}
