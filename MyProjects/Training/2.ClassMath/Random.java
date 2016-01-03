/** The program generates a random date in January
 *  e.g., January,11
 */
public class Random {
    public static void main(String[]args){

        int i = (int)(Math.random()*31+1);   // range from 1 till 32 (exclusively)

        System.out.println("January " + i);
    }
}
