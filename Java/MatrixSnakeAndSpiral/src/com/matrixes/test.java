package com.matrixes;

public class test {
    public static void main(String[] args) {

        int size = 4;
        int i, j, a;
        int [][] matrix = new int[size][size];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random()*20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            if (i >= size) {
                return;
            }
            i++;
            for (a = size - 1; a >= 0; a--) {
                System.out.print(matrix[i][a] + "\t");
            }
        }
        System.out.println();
    }

}
