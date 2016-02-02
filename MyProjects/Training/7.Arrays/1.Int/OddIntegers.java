/**
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а
 * затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97
 * 95 93 ... 7 5 3 1).
 */
public class OddIntegers {
    public static void main(String[]args) {

        /*
        int j[] = new int[100];

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                j[i] = i;
                System.out.print(j[i] + " ");
            }
        }
        */

/*
        int mas[] = new int[50];
		for (int i = 1, j = 0; j < 50; i = i + 2, j++) {
			mas[j] = i;
			System.out.print(mas[j] + " ");
		}
		System.out.println();
		for (int i = mas.length - 1; i != 0; i--)
			System.out.print(mas[i] + " ");
			*/

        int min = 1,
                max = 99,
                count = -1;
        int [] arr = new int[max%2==0 ? max/2 : max/2+1];
//
        String strSorted = "",
                strReversed = "";

//
        while(count < arr.length-1)
        {
            arr[++count] = min;
            strSorted += min +" ";
            strReversed = min +" "+ strReversed;
            min += 2;
        }
        System.out.println(strSorted);
        System.out.println(strReversed);

    }
}


