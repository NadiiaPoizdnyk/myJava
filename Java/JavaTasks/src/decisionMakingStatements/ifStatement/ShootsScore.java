package decisionMakingStatements.ifStatement;

/** An athlete shoots at 3 targets.
 *  For each target hit athlete is given 1 point.
 *  The program displays the result for each shoot and the total score of the athlete.
 *  The result of each shoot is formed by the program randomly.
 */
public class ShootsScore {
    public static void main(String[]args){

        int first = (int)(Math.random()*2);
        int second = (int)(Math.random()*2);
        int third = (int)(Math.random()*2);
        int result = 0;

        if (first == 1){
            System.out.println("Hit the target");
            result = result + 1;
        } else {
            System.out.println("Missed");
            result = result + 0;
        }

        if (second == 1){
            System.out.println("Hit the target");
            result = result + 1;
        } else {
            System.out.println("Missed");
            result = result + 0;
        }

        if (third == 1){
            System.out.println("Hit the target");
            result = result + 1;
        } else {
            System.out.println("Missed");
            result = result + 0;
        }

        System.out.println(result);
    }
}
