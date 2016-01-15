/** The program shows a season of the year randomly.
 */
public class Seasons {
    public static void main(String[]args){

        int season = (int)(Math.random()*4);

        if (season == 0){
            System.out.println("Winter");
        } else if (season == 1){
            System.out.println("Spring");
        } else if (season == 2){
            System.out.println("Summer");
        } else if (season == 3){
            System.out.println("Fall");
        }

    }
}
