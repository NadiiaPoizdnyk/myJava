package decisionMakingStatements.elseIfStatement;

/** The program shows a day of the week randomly
 */
public class Days {
    public static void main(String[]args){

        int week = (int)(Math.random()*7);

        if (week == 0){
            System.out.println("Mon");
        } else if (week == 1){
            System.out.println("Tue");
        } else if (week == 2){
            System.out.println("Wed");
        } else if (week == 3){
            System.out.println("Thu");
        } else if (week == 4){
            System.out.println("Fri");
        } else if (week == 5){
            System.out.println("Sat");
        } else if (week == 6){
            System.out.println("Sun");
        }
    }
}
