/**
 * The program fills the array of the numbers in sequential order and displays it.
 */
public class Sequence {
    public static void main(String[]args){

        String[][] field = new String[5][5];
        int num = 1;

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                field[i][j] = " " + num;
                System.out.print(field[i][j]);
                num++;
            }
            System.out.println(" ");
        }
    }
}
