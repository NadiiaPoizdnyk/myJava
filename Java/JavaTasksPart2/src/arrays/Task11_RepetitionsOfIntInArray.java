package arrays;

/**
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на
 экран в строку. Определите какой элемент встречается в массиве чаще всего и
 выведите об этом сообщение на экран. Если два каких-то элемента встречаются
 одинаковое количество раз, то не выводите ничего.
 */
public class Task11_RepetitionsOfIntInArray {
    public static void main(String[] args) {

        int[] array = new int[11];
        int a = 0, b = 0, c =0;         //counters

        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*4-2);
            System.out.print(array[i] + " ");

            if ( array[i] == -1) a++;
            else if (array[i] == 0)b++;
            else c++;
        }
        System.out.println();

        if (a == b | b == c | a == c) {
            System.out.println("qty of '-1': " + a + ", qty of '0': " + b + " and qty of '1': " + c );
        }else if (b > a & b > c){
            System.out.println("The biggest amount of '0' in the arrays: " + b + " times");
        }else if (c > a & c > b){
            System.out.println("The biggest amount of '1' in the arrays: " + c + " times");
        } else if (a > b & a > c){
            System.out.println("The biggest amount of '-1' in the arrays: " + a + " times");
        }
    }
}
