package loopsTasks.forLoops;

/** The program displays a line of numbers from 1 to 10,
 *  and then the other line, from 10 to 1.
 */
public class LineOfNumbers {
    public static void main(String[]args){

        int i;

        for (i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 10; i > 0; i = i - 1){
            System.out.print(i + " ");
        }
    }
}
