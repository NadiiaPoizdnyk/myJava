/** The program creates an array and fills it with random numbers from 1 to 100.
 * After that, the program displays the array.
 */
public class ArrayWithRandNum {
    public static void main(String[]args){

        int j[] = new int[10];

        for (int i = 0; i < 10; i++){
            j[i] = (int)(Math.random()*100+1);
            System.out.print(j[i]);
            if (i == 9){
                System.out.print(".");
            } else {
                System.out.print(",");
            }
        }
    }
}
