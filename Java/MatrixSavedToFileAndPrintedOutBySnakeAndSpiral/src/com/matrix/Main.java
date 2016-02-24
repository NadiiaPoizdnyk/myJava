package com.matrix;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. User should define the matrix size [1,20]
 * 2. Create the matrix [size][size]
 * 3. User should fill in the matrix with numbers (int [-100,100])
 * 4. Print out the matrix
 * 5. Options:
 * - Print out the matrix by snake (in two ways)
 * - Print out the matrix by spiral
 * - Save the matrix to the file or exit the program
 * - Read the matrix from the file or exit the program
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean index = false;
        String string;
        boolean adv = false;
        Pattern pattern = Pattern.compile("(\\-)?[0-9]{1}|(\\-)?[0-9]{2}|(\\-)?[1]{1}[0]{2}");     //(int [-100,100]) fill in the matrix
        Pattern pattern1 = Pattern.compile("[0-4]{1}");
        Pattern pattern2 = Pattern.compile("[0-2]{1}");
        Matcher matcher, matcher1, matcher2;

        Matrix matrix1 = new Matrix();
        FileOptions fileOptions = new FileOptions();


        //matrix size input
        while (!index){
            System.out.print("Type in the matrix size from 1 to 20: ");
            string = scanner.nextLine();
            try {
                size = Integer.parseInt(string);
                if(size >= 1  && size <= 20){
                    index = true;
                }
                else{
                    index = false;
                    System.out.println("\nSorry! Invalid value has been entered");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nSorry! Invalid value has been entered");
            }
        }

        //fill in the matrix with numbers
        int[][] matrix = new int[size][size];
        int i, j;
        do{
            for(i = 0; i < size; i++) {
                for (j = 0; j < size; j++) {
                    do {
                        System.out.print("Fill in the matrix with numbers from -100 to 100 " +
                                "[" + i + "]" + "[" + j + "]" + ": ");
                        string = scanner.nextLine();
                        matcher = pattern.matcher(string);
                        if (matcher.matches()) {
                            try {
                                matrix[i][j] = Integer.parseInt(string);
                            } catch (Exception e) {
                                System.out.println("\nSorry! Invalid value has been entered");
                            }
                        }
                        if (!matcher.matches())
                            System.out.println("\nSorry! Invalid value has been entered");
                    }while (!matcher.matches());
                }
            }
        } while( i != size);


        matrix1.printMatrix(matrix, size);

        do {
            do {
                System.out.println("\n1) print out the matrix by snake (bottom-up); " +
                        "\n2) print out the matrix by snake (top-down);" +
                        "\n3) print out the matrix by spiral;" +
                        "\n4) save the matrix to file" +
                        "\n0) exit the program");
                System.out.print("Please select the option: ");
                string = scanner.nextLine();
                matcher1 = pattern1.matcher(string);
                if (!matcher1.matches()) System.out.println("Sorry! Invalid value has been entered");
            } while (!matcher1.matches());

            int choice = Integer.parseInt(string);
            if (choice == 1) {
                matrix1.printBySnakeBottomUp(size, matrix);
            }
            if (choice == 2) {
                matrix1.printBySnakeTopDown(size, matrix);
            }
            if (choice == 3) {
                matrix1.printBySpiral(matrix, size);
            }

            if (choice == 4) {
                fileOptions.saveMatrixToFile(matrix, "D:\\Matrix");
                System.out.println("\nYour matrix is saved to the file (D:\\Matrix)");
                do {
                    System.out.print("\nDo you want to load the saved matrix from the file?" +
                            "\nYes - press 1;" +
                            "\nNo - press 2;" +
                            "\nExit the program - press 0." +
                            "\n" +
                            "\nMake your choice: ");

                    string = scanner.nextLine();
                    matcher2 = pattern2.matcher(string);
                    if (!matcher2.matches()) System.out.println("Sorry! Invalid value has been entered");

                    int ch = Integer.parseInt(string);
                    if (ch == 0) {
                        System.exit(0);
                    }
                    if (ch == 1) {
                        fileOptions.loadMatrixFromFile(size, "D:\\Matrix");
                        matrix1.printMatrix(matrix, size);
                    }
                    if (ch == 2) {
                        index = true;
                    }
                } while (!index);
            }
            if (choice == 0){
                adv = true;
            }

        }while (adv != true);


        scanner.close();
    }
}
