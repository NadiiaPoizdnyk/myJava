package com.matrix;

import java.io.*;

public class FileOptions{

    void saveMatrixToFile(int[][] matrix, String path) throws IOException {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (int[] aMatrix : matrix) {                          //for (int j = 0; j < aMatrix.length; j++) {
                for (int anAMatrix : aMatrix) {                     //for (int j = 0; j < aMatrix.length; j++) {
                    bufferedWriter.write(String.valueOf(anAMatrix) + " ");
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    int[][] loadMatrixFromFile(int size, String path) {
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
