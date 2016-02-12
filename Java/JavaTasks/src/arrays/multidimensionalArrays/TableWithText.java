package arrays.multidimensionalArrays;

/**
 * The program displays a 2-dimensional array. The array is initialized when the array is declared.
 */
public class TableWithText {
    public static void main(String[]args){

        String mas[][] = {{"Winter  ", "Spring  ", "Summer  ", "Fall  "},
                {"Daddy  ", "Mama  ", "Son  ", "Daughter  "},
                {"Cold  ","Warm  ", "Hot  ", "Comfy  "}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
