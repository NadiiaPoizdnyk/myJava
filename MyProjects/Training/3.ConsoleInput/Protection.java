import java.util.Scanner;

// resource: Lecture - JUnit_n.pptx Slide#6


public class Protection {
    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        //Integer verification
        System.out.print("Enter integer data: ");
        int a=0;

        while (true) {
            try {
                a = Integer.parseInt(sc.nextLine());
                System.out.println("Correct input = " + a);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect. Try again.");
                System.out.print("Enter integer data :");
                continue;
            }
        }
        sc.close();  //If you do not close the Scanner then Java will not garbage collect the Scanner
                     // object and you will have a memory leak in your program
    }
}