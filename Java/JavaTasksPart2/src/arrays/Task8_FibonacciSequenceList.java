package arrays;

/**
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 Напоминаем, что первый и второй члены последовательности равны единицам, а
 каждый следующий — сумме двух предыдущих.
 */
public class Task8_FibonacciSequenceList {
    public static void main(String[] args) {

        int [] arr = new int[20];

        for (int i = 0; i < arr.length; i++){

            if (i < 2){arr[i] = 1;
            } else {
                arr[i] = arr [i-2] + arr[i-1];
            }

            System.out.print(arr[i] + " ");
        }
    }
}
