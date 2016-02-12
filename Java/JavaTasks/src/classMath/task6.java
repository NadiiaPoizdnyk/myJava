package classMath;

/* Task6. Натуральное положительное число записано в переменную n. Создайте программу,
 * которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [-n;n].
 */
public class task6 {
    public static void main(String[]args){

        int n = 5;

        System.out.println((int)(Math.random()*(n*2)-n));
    }
}