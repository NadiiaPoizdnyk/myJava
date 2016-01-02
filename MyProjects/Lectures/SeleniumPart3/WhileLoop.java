/** Slide #22
 * [ инициализация; ]
 while ( завершение )
 { тело; [итерация;] }
 */
public class WhileLoop {
    public static void main(String[]args){

        int n = 0;

        while (n < 10) {                          //if true --> print out till the statement becomes false --> breaks code execution
            System.out.println("tick " + n);      //Печать десяти строк
            n++; }
        /*
        int n = 10;

        while (n>1) {
            System.out.println(n);
            n--;}
         */
    }
}
