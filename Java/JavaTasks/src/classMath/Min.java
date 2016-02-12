package classMath;

import java.util.Scanner;

public class Min {
    public static void main(String[]args){
        //The MATH library, the min method

        Scanner sc = new Scanner(System.in);
        int a, c;
        int min;
        System.out.println("Type a number:");
        a = sc.nextInt();
        System.out.println("Type a number:");
        c = sc.nextInt();
        sc.close();

        min = Math.min(a, c);
        System.out.println("The smallest number: " + min);

    }

}
