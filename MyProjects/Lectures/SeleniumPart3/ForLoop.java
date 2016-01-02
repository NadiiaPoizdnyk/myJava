/** Slide #24
 * for ( инициализация; завершение; итерация ) тело;
 */
public class ForLoop {
    public static void main(String[]args){

        int [] myIntArray = {100,31,26,48,52};

        for (int index=0; index<5; index++){            //1.init; 2.checks; 3.executes; 4.increments index by 1
            System.out.println(myIntArray[index]);
        }

        System.out.println("_______");

        for (int element: myIntArray){
            System.out.println(element);
        }


        /* for (int n = 10; n > 0; n--) {
               System.out.println("tick " + n);
          }
        */
    }

}
