package arrays.intExamples;

import java.util.Scanner;
/*
* 1. enter array length
* 2. while invalid input is entered, repeat the loop to enter array length
* 3. when valid input is entered, create the array with the length which was entered by user
* 4. Insert array elements from the keyboard
* 5. while invalid input is entered, repeat the loop to enter array elements
* catch NumberFormatException, and put '0' instead invalid input
* 6. print out the array
 */

public class FromKeyboard {
    public static void main(String[] args) {

        int size = 0;
        boolean adv = false;

        Scanner sc = new Scanner(System.in);

        while (!adv){
            System.out.print("Please, enter array length: ");
            String str = sc.nextLine();

            // verify 1)negative numbers; 2)special signs; 3)empty value; 4)letters;
            //  5)whitespace + letter/numbers
            try {
                size = Integer.valueOf(str); //Use Integer.parseInt()/.valueOf() methods to validate the integer input.

                //verify negative numbers input --> invalid value
                if (size <= 0){
                    System.out.print("Error! Invalid value has been entered! ");
                    adv = false;
                }
                if (size > 0) {
                    adv = true;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry! Invalid value has been entered. ");
            }
        }

        int array[] = new int[size]; // Создаём массив размером в size


        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {


            String s = sc.nextLine();
             // Заполняем массив элементами, введёнными с клавиатуры

            //this block will catch NumberFormatException, and put '0' instead invalid input
            try{
                array[i] = Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.out.println("Its not a valid Integer!");
            }
        }
        sc.close();

        System.out.print ("ARRAY:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
    }
}
