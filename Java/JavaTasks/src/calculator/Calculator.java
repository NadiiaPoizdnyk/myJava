package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Type-in the 1st integer: ");
        int a = sc.nextInt();
        System.out.println("Type-in the 2nd integer: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("Addition: " + sum(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Division: " + div(a, b));
        System.out.println("Multiplication: " + mult(a, b));

    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int div(int a, int b) {
        int result = a % b;
        return result;
    }

    public static int mult(int a, int b) {
        int result = a * b;
        return result;
    }
}
