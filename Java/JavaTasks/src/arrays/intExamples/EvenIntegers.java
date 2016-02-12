package arrays.intExamples;

/**
 * Создайте массив из всех чётных чисел от 2 до 80 и выведите элементы массива на
 * экран сначала в строку, отделяя один элемент от другого пробелом.
 * 2 4 6 ... 78 80
 */
public class EvenIntegers {
    public static void main(String[]args){

        int[]arr = new int[80/2];
        // int size = arr.length;

        for (int i = 0; i < arr.length; i++){ //for (int = 0; i < size; i++){
            arr[i] = (i + 1)*2;
            System.out.print(arr[i] + " ");
        }


        /*

        int mass[] = new int[80/2];

        for (int i = 0, j = 2; i < mass.length; i++, j+=2){
            mass[i] = j;
            System.out.print(mass[i] + " ");
        }
        */
    }
}
