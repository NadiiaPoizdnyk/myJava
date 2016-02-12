package decisionMakingStatements.ternary;

/** An athlete shoots at 3 targets.
 *  For each target hit athlete is given 1 point.
 *  The program displays the result for each shoot and the total score of the athlete.
 *  The result of each shoot is formed by the program randomly.
 */
public class TargetsShooting {
    public static void main(String[]args){

        int first = (int)(Math.random()*2);
        int second = (int)(Math.random()*2);
        int third = (int)(Math.random()*2);
        int result = 0;
        String results;

        result = first == 0 ? result +0 : result + 1;
        results = first == 0 ? "Missed" : "Hit the target";
        System.out.println(results);

        result = second == 0 ? result +0 : result +1;
        results = second == 0 ? "Missed" : "Hit the target";
        System.out.println(results);

        result = third == 0 ? result +0 : result +1;
        results = third == 0 ? "Missed" : "Hit the target";
        System.out.println(results);

        System.out.println(results);
    }
}
