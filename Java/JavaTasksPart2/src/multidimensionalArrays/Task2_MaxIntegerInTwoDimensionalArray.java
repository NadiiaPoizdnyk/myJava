package multidimensionalArrays;

/**
 * Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых
 чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке
 вывести на экран значение максимального элемента этого массива (его индекс не
 имеет значения).
 */
public class Task2_MaxIntegerInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int max = -100;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int)(Math.random()*200-100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("The maximum array's number: " + max) ;
    }
}
