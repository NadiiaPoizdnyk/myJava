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
 * 5. Save the matrix to the file or exit the program
 * 6. Read the matrix from the file or exit the program
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
            System.out.println("1 - Save my matrix to the file; " +
                    "2 - Do not save my matrix to file; " +
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
        if (choice == 2){
            System.out.println("It's a pity :( Bye");
        }
        if (choice == 1){
            saveMatrixToFile(matrix, "D:\\Matrix");
            System.out.println("Your Matrix is saved to the file (D:\\Matrix)");
            do {
                System.out.println("1 - Load my matrix from the file; " +
                        "2 - Do not load my matrix from file; " +
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
            if (choice == 1){
                int[][] newMatrix = loadMatrixFromFile(size, "D:\\Matrix");
                printMatrix(newMatrix,size);
            }
            if (choice == 2){
                System.out.println("It's a pity :( Bye");
            }
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

    private static void saveMatrixToFile(int[][] matrix, String path) throws IOException {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    bufferedWriter.write(String.valueOf(matrix[i][j]) + " ");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[][] loadMatrixFromFile(int size, String path) {
        int[][] matrix = new int[size][size];
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            for (int i = 0; i < matrix.length; i++) {
                String[] strArr = br.readLine().trim().split(" ");
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Integer.parseInt(strArr[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }


}
