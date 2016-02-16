package arrays.stringExapmles;

import java.util.Scanner;
import java.util.regex.Pattern;

/** The user enters 3 words.
 * The program writes them into an array and prints 3 words.
 */
public class ThreeWords {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String str = null;
        Pattern pattern = 


        String mas[] = new String[3];
        for (int i = 0; i < 3; i++){

            while (!adv){
                System.out.println("Type a word: ");

                try {
                    str = sc.nextLine();
                    mas[i] = str;

                    //verify empty str and whitespace + letter/numbers --> invalid value
                    if (str.isEmpty()) {
                        System.out.println("Error! Repeat your try. ");
                        adv = false;
                    }
                    //verify numbers input --> invalid value
                    if (str.matches("\\d")){
                        System.out.println("Error! Repeat your try. ");
                        adv = false;
                    }
                    break;
                }catch (StringIndexOutOfBoundsException e){
                    System.out.println("Repeat your try.");
                }
            }

        }

        for (int i = 0; i < 3; i++){
            System.out.print(mas[i] + " ");
        }
        sc.close();
    }
}
