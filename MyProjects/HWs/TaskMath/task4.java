/* Task4. В переменной n лежит некоторое вещественное число.
 * Вычислить и вывести на экран значение функции «сигнум» от этого числа (-1, если число отрицательное;
 * 0, если нулевое; 1 если, положительное).
 * ????
*/
public class task4 {
    public static void main(String[]args){

        double a, b;
        int n;
        a = 0.1;
        b = Math.ceil(Math.abs(a)/(a+1));
        n = (int)b;

        System.out.println(n);
    }
}