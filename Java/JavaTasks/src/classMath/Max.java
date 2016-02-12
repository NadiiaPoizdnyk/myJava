package classMath;

import java.util.Scanner;

public class Max {
    public static void main(String[]args){
        //the MATH library, the max method

        Scanner sc = new Scanner(System.in);
        int a, c;
        int max;
        System.out.println("Type a number:");
        a = sc.nextInt();
        System.out.println("Type a number:");
        c = sc.nextInt();
        sc.close();

        max = Math.max(a, c);
        System.out.println("Maximum number: " + max);
    }
}
