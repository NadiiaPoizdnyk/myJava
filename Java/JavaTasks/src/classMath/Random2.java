package classMath;

/** The program randomly produces loading capacity from 0 to 100% and from 1 to 100%.
 *  e.g.,
 *  Loading capacity: 48%
 *  50%
 */
public class Random2 {
    public static void main(String[]args){

        int i = (int)(Math.random()*101);

        System.out.println("Loading capacity: " + i + "%");
        System.out.println((int)(Math.random()*100+1) + "%");
    }
}
