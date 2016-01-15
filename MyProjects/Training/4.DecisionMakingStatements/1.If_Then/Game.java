/** 'Rock-Paper-Scissors-Shoot' Game
 *  Two players makes his choice:
 *  stone - 0, scissors-1, paper -2
 *  The program determines which of those two won.
 *  The choice of the participants is formed in a random way.
 */
public class Game {
    public static void main(String[]args){

        int player1 = (int) (Math.random()*3);
        int player2 = (int) (Math.random()*3);

        if(player1==0){
            if(player2 == 0){
                System.out.println("The tie");
            }
            if (player2 == 1){
                System.out.println("Player 1 is a winner");
            }
            if (player2 == 2){
                System.out.println("Player 2 is a winner");
            }
        }

        if (player1 == 1){
            if (player2 == 0){
                System.out.println("Player 2 is a winner");
            }
            if (player2 == 1){
                System.out.println("The tie");
            }
            if (player2 == 2){
                System.out.println("Player 1 is a winner");
            }
        }

        if (player1 == 2){
            if (player2 == 0){
                System.out.println("Player 1 is a winner");
            }
            if (player2 == 1){
                System.out.println("Player 2 is a winner");
            }
            if (player2 == 2){
                System.out.println("The tie");
            }
        }
    }
}
