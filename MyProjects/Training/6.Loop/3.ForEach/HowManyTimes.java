import java.util.Scanner;

/** The program creates an array consisting of the numbers from 1 to 10.
 * The user enters a number. The program reports how many times the entered number meets in the array.
 */
public class HowManyTimes {
    public static void main(String[]args){

        int[] g = new int[10];

        for (int i = 0; i < 10; i++){
            g[i] = (int)(Math.random()*10+1);
        }

        System.out.println("Type a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        int num = 0;

        for (int y : g){
            if (y == a){
                num = num +1;
            }
        }
        System.out.println(a + " meets " + num + " times");
    }
}
