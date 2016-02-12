package loopsTasks.doWileLoops;

/** Slide #23
 * [ инициализация; ]
 do { тело; [итерация;] }
 while ( завершение );
 */
public class DoWhileLoop {
    public static void main(String[]args){

        int b = 0;

        do {
            System.out.println("tick" + b);
            b++;
        } while (b<=10);                        //if the statement false --> is run at list 1 time

        /* int n = 10;
        do { System.out.println("tick " + n); }
        while (--n > 0); }
        */

    }
}

/*
Difference between While loop and Do-While loop:
- While loop: if the statement is FALSE --> nothing is printed out;
- Do-While loop: if the statement FALSE --> teh code is run at list 1 time;
 */