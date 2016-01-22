import java.util.Scanner;

/** The user types a number from 1 to 10.
 * The program creates an array whose size = the number, entered by the user,
 * fills it randomly and displays the array.
 */
public class ArrayEqualsNumber {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Print a number:");
        int a = sc.nextInt();
        sc.close();

        if (a < 1 || a > 10){
            System.out.println("Wrong");
        } else {
            int j[] = new int[a];

            for (int i = 0; i < a; i++){
                j[i] = (int)(Math.random()*10+1);
                System.out.print(j[i]);
                if (i == (a - 1)){
                    System.out.print(".");
                } else {
                    System.out.print(",");
                }
            }
        }
    }
}
