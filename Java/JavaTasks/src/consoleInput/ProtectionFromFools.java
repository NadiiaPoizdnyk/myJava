package consoleInput;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ProtectionFromFools {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some integer: ");

        while (true) {
            try {
                int number = Integer.parseInt(reader.readLine());
                System.out.println("Your number is " + number);
                break;

            } catch (NumberFormatException e) {
                System.out.println("The input is not an integer. Try one more time: ");
            }
        }
        reader.close();
    }
}