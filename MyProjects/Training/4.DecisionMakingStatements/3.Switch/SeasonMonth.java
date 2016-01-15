/** The program shows a season of the year and a month randomly.
 */
public class SeasonMonth {
    public static void main(String[]args){

        int season = (int)(Math.random()*4);
        int month = (int)(Math.random()*3);

        switch (season){
            case 0:
                System.out.print("Winter-");
                switch (month){
                case 0:
                    System.out.println("Dec");
                    break;
                case 1:
                    System.out.println("Jan");
                    break;
                case 2:
                    System.out.println("Feb");
                    break;
            }
            break;

            case 1:
                System.out.print("Spring-");
            switch (month){
                case 0:
                    System.out.println("Mar");
                    break;
                case 1:
                    System.out.println("Apr");
                    break;
                case 2:
                    System.out.println("May");
                    break;
            }
            break;

            case 2:
                System.out.print("Summer-");
            switch (month){
                case 0:
                    System.out.println("Jun");
                    break;
                case 1:
                    System.out.println("Jul");
                    break;
                case 2:
                    System.out.println("Aug");
                    break;
            }
            break;

            case 3:
                System.out.print("Autumn-");
            switch (month){
                case 0:
                    System.out.println("Sep");
                    break;
                case 1:
                    System.out.println("Oct");
                    break;
                case 2:
                    System.out.println("Nov");
                    break;
            }
        }
    }
}
