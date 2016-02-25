package com.matrixes;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. User should define the matrix size [1,20]
 * 2. Create the matrix [size][size]
 * 3. Fill in the matrix with numbers randomly (int [0,50]
 * 4. Print out the matrix
 * 5. Print out the matrix by snake (in two ways)
 * 6. Print out the matrix by spiral
 */
public class Matrix {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(System.currentTimeMillis());
        int size, i, j, choice;
        int[][] matrix;
        String string, string1;
        Pattern pattern = Pattern.compile("[1-9]{1}|[1]{1}[0-9]{1}|[2]{1}[0]{1}");      //int digits [1,20]
        Matcher matcher, matcher1;
        Pattern pattern1 = Pattern.compile("[0-2]{1}");  //regexp for option selection [0-2]

        do {
            System.out.print("Type in array size from 1 to 20: ");
            string = scanner.nextLine();
            matcher = pattern.matcher(string);
            if (!matcher.matches()) System.out.println("Error! Invalid value has been entered! Try again ");
        } while (!matcher.matches());

        size = Integer.parseInt(string);

        System.out.println("-----------------------------------");
        System.out.println("MATRIX");
        System.out.println("-----------------------------------");

        matrix = new int[size][size];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(51);
                //System.out.print(matrix[i][j] + "\t  ");
            }
            //System.out.println(" ");
        }
        printMatrix(matrix,size);

        do {
            System.out.println("1 - Print out the matrix by snake; " +
                    "2 - Print out the matrix by spiral; " +
                    "0 - exit the program.");
            System.out.println("Please select the option: ");
            string1 = scanner.nextLine();
            matcher1 = pattern1.matcher(string1);
            if (!matcher1.matches()) System.out.println("Error! Invalid value has been entered! Try again ");
        }while (!matcher1.matches());

        choice = Integer.valueOf(string1);

        if (choice == 0){
            System.out.println("Thnx! :) Enjoy ;)");
        }
        if (choice == 1) {



            System.out.println("Snake from the end of the matrix:");
            printBySnakeOne(size, matrix);
            System.out.println("");
            System.out.println("Snake from the beginning of the matrix:");
            printBySnakeTwo(size, matrix);
        }
        if (choice == 2) {
            printBySpiral(matrix, size);
        }

    }

    private static void printMatrix(int[][] matrix, int size) {
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

    //method to print out the matrix by snake (bottom-up)
    private static void printBySnakeOne(int size, int[][] matrix){
        int v, i, j;
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

//method to print out the matrix by snake (top-down)
    private static void printBySnakeTwo(int size, int[][] matrix) {
        int i, j, a;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
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


    private static void printBySpiral(int [][]matrix,int size) {
        int i, j, n;
        int a = size-1, b = 0;

        System.out.println();
        System.out.println("SPIRAL");

        i = 0;
        j = 0;

        for (n = 0; n < Math.pow(size, 2); ++n) {
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