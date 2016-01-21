/** The program displays a line of numbers from 1 to 10,
 *  and then the other line, from 10 to 1.
 */
public class LineOfNumbers {
    public static void main(String[]args){

        int i = 0;

        do {
            i = i + 1;
            System.out.print(" " + i + " ");
        } while (i < 10);
        System.out.println("");
        do {
            System.out.print(" " + i + " ");
            i = i - 1;
        } while (i > 0);
    }
}
