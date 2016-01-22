/** The program creates an array of 10 elements and fills it randomly.
 * The program changes sign first five elements of the array.
 */
public class ArraysInPairs {
    public static void main(String[]args){

        int j[] = new int[10];

        for (int i = 0; i < 10; i++){
            j[i] = (int)(Math.random()*100+1);
            System.out.print(j[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < 10; i++){
            if (i<5){
                j[i] = -j[i];
            }
            System.out.print(j[i] + " ");
        }
    }
}
