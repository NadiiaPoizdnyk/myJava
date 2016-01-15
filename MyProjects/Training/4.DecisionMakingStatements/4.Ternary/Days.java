/** The program displays the number of the day of the week randomly
 * and gives a message.
 */
public class Days {
    public static void main(String[]args){

        int week = (int)(Math.random()*7+1);
        String k = week <6 ? "work day" : "day off";

        System.out.println("Number " + week + ".");
        System.out.println("Today is a " + k);
    }
}
