package arrays.multidimensionalArrays;


public class Matrix {
    public static void main(String[]args){

        int multiplication[][] = new int[10][10];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (i >= j){             //if (i < j){
                    multiplication[i][j] = 0;
                } else {
                    multiplication[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(multiplication[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
