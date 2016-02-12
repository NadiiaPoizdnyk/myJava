package arrays;

/**
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на
 экран в строку. Определить и вывести на экран сообщение о том, является ли массив
 строго возрастающей последовательностью.
 */
public class Task7_IncreasingOrNonIncreasingProgression {
    public static void main(String[] args) {

        int [] array = new int[4];

        for (int i = 0; i < array.length; i++){         //the 1st loop for the arrays printing out
            array[i] = (int)(Math.random()*90+10);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < array.length; i++){         //the 2nd loop for the same arrays verification
            if(i > 0){
                if (array[i-1] >= array[i]){
                    System.out.println("Non-increasing progression");
                    break;
                }
            }
            if (i == array.length-1){
                System.out.println("Increasing progression");
            }
        }
    }
}
