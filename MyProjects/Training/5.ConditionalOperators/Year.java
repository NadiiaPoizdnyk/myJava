/** The program displays the season of the year according to the sequence number of the month.
 * A month is chosen randomly.
 */
public class Year {
    public static void main(String[]args){

        int month = (int)(Math.random()*12+1);
        String s;

        if (month == 1 || month == 2 || month == 12){
            s = "Winter";
        }
        if (month == 3 || month == 4 || month == 5){
            s = "Spring";
        }
        if (month == 6 || month == 7 || month == 8){
            s = "Summer";
        }
        else s = "Fall";
        System.out.println(s);
    }
}
