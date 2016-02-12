package classMath;

/* Task2. В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр.
 */
public class task2 {
    public static void main(String[]args){

        double a, b, c;
        a = 15;
        b = 20;
        c = a+b;

        System.out.println("S_tr = " + (a*b/2));
        System.out.println("P_tr = " + (a+b+c));
    }
}