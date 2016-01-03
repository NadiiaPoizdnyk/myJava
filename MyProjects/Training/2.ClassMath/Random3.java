/** The program generates a random number from 1 to 10 and from 0 to 9.
 * e.g.
 * Random number: 10
 * 9
 */
public class Random3 {
    public static void main(String[]args){

        int i = (int)(Math.random()*10+1);

        System.out.println("Random number: " + i);
        System.out.println((int)(Math.random()*10));
    }
}
