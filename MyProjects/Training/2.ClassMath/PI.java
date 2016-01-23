import java.util.Scanner;

public class PI {
    public static void main(String[]args){
        //the MATH library, PI

        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Type a number:");
        a = sc.nextInt();
        sc.close();

        System.out.println("The circle length is " + 2 * Math.PI * Math.abs(a));
    }
}
