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

public class Task2_EvenIntegers {
    public static void main(String[]args){

        int[] a = new int[10];
        int i = 0;
        int b = 0;

       while (++b < 20) a[i++] = ++b;


        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");

        System.out.println();

        for (i = 0; i < 10; i++)
            System.out.println(a[i]);

    }

}
