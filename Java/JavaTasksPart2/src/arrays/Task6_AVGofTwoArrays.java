package arrays;

/**
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
 массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
 элементов каждого массива и сообщите, для какого из массивов это значение
 оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class Task6_AVGofTwoArrays {
    public static void main(String[] args) {

        double sum_arr1 = 0, sum_arr2 = 0;              // for AVG
        int [] arr1 = new int[5], arr2 = new int[5];

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*6);
            System.out.print(arr1[i] + " ");            // print out the arrays #1
            sum_arr1 += (double) arr1[i]/arr1.length;   //

        }
        System.out.println("");
        for (int j = 0; j < arr2.length; j++){
            arr2[j] = (int)(Math.random()*6);
            System.out.print(arr2[j] + " ");
            sum_arr2 += (double) arr2[j]/arr2.length;
        }
        System.out.println("");

        if (sum_arr1 == sum_arr2){ System.out.println("AVG of both arrays is equal");
        } else if (sum_arr1 > sum_arr2) {
            System.out.println("AVG of arrays #1 is greater than AVG of arrays #2");
        } else if (sum_arr2 > sum_arr1) {
            System.out.println("AVG of arrays #2 is greater than AVG of arrays #1");
        }
    }
}
