package arrays;

/**
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой
 элемент является в этом массиве максимальным и сообщите индекс его последнего
 вхождения в массив.
 */
public class Task9_MaxArrElementWithIndex {
    public static void main(String[] args) {

        int [] array = new int[12];
        int max = 0, index = 0;

        for (int i = 0; i < array.length; i++){

            array[i] = (int)(Math.random()*31-15);
            System.out.print(array[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++){
            if (array[i] <= max){
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max element in the arrays: " + array[index]);
        System.out.println("The last arrays entrance index of this element: " + index);
    }
}
