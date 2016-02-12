package arrays.multidimensionalArrays;

/**
 * The program puts the multiplication table in a 2-dimensions array and displays the multiplication table.
 */
public class TableWithNumb {
    public static void main(String[]args){

        int multiplication[][] = new int[10][10];

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                multiplication[i][j] = i*j;
                System.out.print(multiplication[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
