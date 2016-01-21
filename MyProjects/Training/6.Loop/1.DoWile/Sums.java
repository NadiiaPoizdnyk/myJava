/** The program sums the numbers from 1 to 10.
 */
public class Sums {
    public static void main(String[]args){

        int i = 0;
        int sum = 0;

        do {
            sum = sum + i;
            i = i + 1;
        } while (i !=11);
        System.out.println(sum);
    }
}
