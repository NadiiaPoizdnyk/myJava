/* Task3. Натуральное положительное число записано в переменную n. Определить и вывести на экран, сколько цифр в числе n.
 * ???
 */
public class task3 {
    public static void main(String[]args){

        double n;
        int a;
        n = 15308;
        a = (int)(Math.ceil(Math.log10(n)+0.000000000000001));

        System.out.println(a);
    }
}
