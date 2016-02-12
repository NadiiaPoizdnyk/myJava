package arrays;

import java.util.Random;

/**
 * Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на
 * экран. Подсчитайте сколько в массиве чётных элементов и выведите это количество на
 * экран на отдельной строке.
 */
public class Task4_DisplaysEvenIntAmount {
    public static void main(String[]args){

        int [] arr = new int[15];
        int a = 0;

        for (int i = 0; i < arr.length; i++){
            Random random = new Random();
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]);

            if (arr[i] > 0 && arr[i] % 2 == 0){
                a++;
            }

        }
        System.out.println("");
        System.out.println("The arrays has " + a + " even numbers.");

    }
}
