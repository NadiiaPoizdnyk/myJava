import java.util.Scanner;

/** Slide #19-20
 * if (логическое выражение)
 оператор1;
 [ else оператор2;]

 Task #5 Написать программу для определения, к какому времени года относится тот или иной месяц,
 используя логические операторы (искомый месяц инициализируется в самой программе числом).
 */

    public class ifElse {
        public static void main (String[]args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the month in integer format: ");
            int month = sc.nextInt();


            //int month = 9;
            String season;

            if ((month==12)||(month==1)||(month==2)) {
                season = "Winter";
            }
            else if (month==3 || month==4 || month==5) {
                season = "Spring";
            }
            else if (month==6 || month==7 || month==8) {
                season = "Summer";
            }
            else if (month==9 || month==10 || month==11) {
                season = "Autumn";
            }
            else {
                season = "not a month";
            }

            System.out.println("This is " + season + "!");
        }
    }
