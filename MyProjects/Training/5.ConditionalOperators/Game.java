/** 'Rock-Paper-Scissors-Shoot' Game
 *  Two players makes his choice:
 *  stone - 0, scissors-1, paper -2
 *  The program determines which of those two won.
 *  The choice of the participants is formed in a random way.
 */
public class Game {
    public static void main(String[]args){

        int john = (int)(Math.random()*3);
        int peter = (int)(Math.random()*3);
        String s;

        if (john == 0 && peter == 0 || john == 1 && peter == 1 || john == 2 && peter == 2){
            s = "The tie";
        } else if (john == 0 && peter == 1 || john == 1 && peter == 2 || john == 1 && peter == 0){
            s = "John";
        } else {
            s = "Peter";
        }
        System.out.println(s);
    }
}
