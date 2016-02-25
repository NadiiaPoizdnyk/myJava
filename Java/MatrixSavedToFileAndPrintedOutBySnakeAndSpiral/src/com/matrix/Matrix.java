package com.matrix;

public class Matrix {

    void printMatrix(int[][] matrix, int size) {
        int a = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("   " + a + ". " + matrix[i][j] + "   ");
            }
            a++;
            System.out.println();
        }
        System.out.println();

    }

    void printBySnakeBottomUp(int size, int[][] matrix){
        int v, i, j;

        System.out.println("\nBOTTOM-UP SNAKE");
        System.out.println("------------------");
        for (i = size-1; i >= 0; i --) {
            for (j = size-1; j >= 0; j--) {
                System.out.print(matrix[i][j] + "\t");
            }
            if(i == 0){
                return;
            }
            i--;
            for(v = 0 ;v < size; v++){
                System.out.print(matrix[i][v] + "\t");
            }

        }
        System.out.println();
    }

    void printBySnakeTopDown(int size, int[][] matrix) {
        int i, j, a;

        System.out.println("\nTOP-DOWN SNAKE");
        System.out.println("------------------");
        for (i = 0; i <= size-1; i++) {
            for (j = 0; j <= size-1; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            if (i >= size-1) {
                return;
            }
            i++;
            for (a = size - 1; a >= 0; a--) {
                System.out.print(matrix[i][a] + "\t");
            }
        }
        System.out.println();
    }


    void printBySpiral(int [][]matrix,int size) {
        int i, j, n;
        int a = size - 1, b = 0;

        System.out.println("\nSPIRAL");
        System.out.println("----------");

        i = 0;
        j = 0;

        for (n = 0; n < size*size; ++n) {           //size*size = Math.pow(size,2)
            System.out.print(matrix[i][j] + "   ");
            if ((i == (b + 1)) && (j == b)) {       //inner flow
                a--;
                b++;
            }
            if ((j == a) && (i < a)) {              //to the down
                i++;
                continue;
            }
            if ((j < a) && (i == b)) {              //to the right
                j++;
                continue;
            }
            if ((i == a) && (j > b)) {              //to the left
                j--;
                continue;
            }
            if ((j == b) && (i > b)) {              //to the up
                i--;
            }
        }
    }

}
