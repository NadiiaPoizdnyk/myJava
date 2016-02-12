package arrays;

/**
 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на
 экран в строку. Замените каждый элемент с нечётным индексом на ноль. Снова
 выведете массив на экран на отдельной строке.
 */
public class Task5_DisplaysZerosInsteadOddNumbers {
    public static void main(String[] args) {

        int [] arr = new int[8];
        int i;

        //displays arrays with length = 8 and in [1;10] range
        for (i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10+1);
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        //displays the same arrays but with '0' instead of odd numbers
        for (i = 0; i < arr.length; i++){
            if (arr[i] %2 != 0) arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }
}
