package arrays;

/**
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а
 * затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97
 * 95 93 ... 7 5 3 1).
 */
public class Task3_OddIntegers {
    public static void main(String[]args) {

        int a = 0;
        for(int i = 1;i <= 99;i++){
            if(i % 2 != 0)a++;
        }

        int[] arr = new int[a];
        for(int i = 1,b = 0;i <= 99;i++){
            if(i % 2 != 0){
                arr[b] = i;
                System.out.print(arr[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i = arr.length - 1;i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
