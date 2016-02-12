package loopsTasks.forLoops;

/** The program prints squared numbers from 1 to 10,
 * then the other line, squared numbers from 10 to 1.
 */
public class SquaredNumbers {
    public static void main(String[]args){

        int i;

        for (i = 1; i <= 10; i++){
            System.out.print((i*i)+ " ");
        }
        System.out.println("");

        for (i = 10; i >0; i = i - 1){
            System.out.print((i*i)+ " ");
        }
    }
}
