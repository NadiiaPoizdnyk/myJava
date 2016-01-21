/**
 * The program displays qty of fives in the array.
 */
public class QtyOfFives {
    public static void main(String[]args){

        int[] g = {8, 7, 10, 5, 4, 9, 2};

        int num = 0;

        for (int y : g){
            if (y == 5){
                num = num +1;
            }
        }
        System.out.println(num);
    }
}
