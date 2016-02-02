/** The program creates 2 arrays 'j' and 'g' of 10 elements in each.
 *  The program fills 1st array 'j' to the array 'g' and displays the array 'g'.
 */
public class TwoArrays {
    public static void main(String[]args){

        int j[] = new int[10];
        int g [] = new int[10];

        for (int i = 0; i < 10; i++){
            j[i] = (int)(Math.random()*100+1);
            System.out.print(j[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++){
            g[i] = j[i];
            System.out.print(g[i] + " ");
        }
    }
}
