import java.util.Scanner;

/**
 * resource: Lecture - JUnit_n.pptx Slide#5
 *
 * Fool Protection
 * 1. First use nextLine() to read the entire line.
 * 2. Use Integer.parseInt() method to validate the integer input.
 */
public class ScannerFoolProtection {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Type some phrase:");
        String s = scan.nextLine();
        try{
            Integer.parseInt(s);
        } catch(NumberFormatException ex){
            System.out.println("It's not a valid Integer");
        }
    }
}
