/* Task7. В переменные a и b записаны целые числа, при этом b больше a.
 * Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b].
 */
public class task7 {
    public static void main(String[]args){

        int a = 5;
        int b = 11;
        int c = b - a;

        System.out.println((int)(Math.random()*c+a));

    }
}