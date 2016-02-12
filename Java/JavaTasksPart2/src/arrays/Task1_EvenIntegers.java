package arrays;

/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на
 * экран сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки).
 * 2 4 6 ... 18 20
 * 2
 * 4
 * 6
 * ...
 * 20
 */
public class Task1_EvenIntegers {
    public static void main(String[]args){

        int[]arr = new int[11];
        int [] arr1 = new int[10];

        for (int i = 1; i < arr.length; i++){
            arr[i] = i *2;
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (i + 1)*2;
            System.out.println(arr1[i]);
        }
    }
}
